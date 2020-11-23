package com.company;

public enum Commandword {
    ;
    private final String commandString;

    public enum CommandWord
                add("add building"), remove("remove building");
}

    private String commandstring;
    Commandword(String commandString)
    {
        this.commandString = commandString;
    }
    public String toString()
    {
        return commandString
    }
}
