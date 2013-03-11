import re
import sys

class ClassParser(object):
    """
    A class to parse Java classes source files and detect attributes
    for which a generator should be created.
    """

    ATTR_PATTERN = "\s*(public|protected|private)\s+(\w+)\s+(\w+)\s*(=.*)?;"
    ATTR_REGEXP = re.compile(ATTR_PATTERN)

    def __init__(self, file_path):
        """
        Initializes this instance.
        @type file_path: str
        @param file_path: the path to the Java source file_name
        """
        self.__file_path          = file_path
        self.__file_object        = None
        self.__output_file_name   = "out.generated"
        self.__declarations       = []
        self.__types              = []
        self.__attributes         = []

    def open_file(self):
        """
        Opens the file for reading.
        """
        self.__file_object = open(self.__file_path, "r")

    def close_file(self):
        """
        Closes the file.
        """
        self.__file_object.close()

    def check_attribute_declaration(self, line):
        """
        Returns a C{bool} indicating whether the given C{line}
        corresponds to an attribute declaration or not.
        @rtype: bool
        @return: C{True} if the line corresponds to an attribute
            declaration, C{False} otherwise.
        """
        is_attribute = False
        match_object = ClassParser.ATTR_REGEXP.match(line)
        if match_object is not None:
            matches = match_object.groups()
            if len(matches) >= 3:
                is_attribute = True
                self.__types.append(matches[1])
                self.__attributes.append(matches[2])
        return is_attribute

    def find_attributes(self):
        """
        Find all lines in the source file that correspond to
        an attribute declaration.
        Please note that there is a constraint that an attribute declaration
        has to be done on one single line only.
        """
        current_line = self.__file_object.readline()
        while current_line != "":
            self.check_attribute_declaration(current_line)
            current_line = self.__file_object.readline()

    def generate(self):
        """
        Generates all required getters and setters.
        """
        length  = len(self.__types)
        current_index = 0
        if length != len(self.__attributes):
            raise
        while current_index < length:
            current_type = self.__types[current_index]
            current_attr = self.__attributes[current_index]
            attribute_suffix = current_attr.capitalize()
            getter_str = "public %s get%s() {\n" % (current_type, attribute_suffix)
            getter_str += " return this.%s;\n" % (current_attr)
            getter_str += "}"
            setter_str = "public void set%s(%s new%s) {\n" % \
                (attribute_suffix, current_type, current_attr)
            setter_str += "  this.%s = new%s;\n" % (current_attr, current_attr)
            setter_str += "}"
            print getter_str
            print setter_str
            current_index += 1

def usage():
    print "%s <file_path>" % (__file__)

if __name__ == "__main__":
    if len(sys.argv) < 2:
        usage()
        sys.exit(1)
    java_file = sys.argv[1]
    print "Parsing file: %s" % str(java_file)
    parser = ClassParser(java_file)
    parser.open_file()
    parser.find_attributes()
    parser.generate()
    parser.close_file()