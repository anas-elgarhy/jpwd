package com.anas.javautils.jpwd.args;

import org.apache.commons.cli.Option;

public enum CLIOption {
    HELP("h", "help", false, "Print this message"),
    VERSION("v", "version", false, "Print version information"),
    SEPARATOR("s", "separator", true, """
            Set the separator (like '-'),
            default is system separator (like '\\' in windows or '/' in linux and unix like systems)"""),
    SEPARATOR_COLOR("sc", "separator-color", true, """
            Set the separator color, as a hexadecimal only like '#ff0000'"""),
    NO_COLORS("nc", "no-colors", false, "Disable colors"),
    ALIGNMENT("a", "alignment", true, """ 
            Set the output alignment (left, right, center), default is left"""),
    BACKGROUND("b", "background", true, """
            Set the background color default is none, as a hexadecimal only like '#ff0000'"""),
    NO_ICONS("ni", "no-icons", false, "Disable icons"),
    ;

    private final Option option;

    CLIOption(final String shortName,
              final String longName,
              final boolean hasArgument,
              final String description) {
        option = new Option(shortName, longName, hasArgument, description);
    }

    public Option getOption() {
        return option;
    }
}