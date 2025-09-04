package ru.vladislav117.jwriter.utils;

public final class IndentUtils {
    public static String indentByLevel(int indentLevel) {
        String indent = "";
        for (int indentLevelIndex = 0; indentLevelIndex < indentLevel; indentLevelIndex++) {
            indent += "    ";
        }
        return indent;
    }
}
