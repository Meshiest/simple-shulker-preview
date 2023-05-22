package com.bvengo.simpleshulkerpreview;

public enum RegexGroup {
    MINECRAFT_PLAYER_HEAD("^block\\.minecraft\\.player_head$"),
    MINECRAFT_SHULKER("^block\\.minecraft\\..*shulker_box$"),
    MINECRAFT_BUNDLE("^item\\.minecraft\\.bundle$");

    public final String regex;
    RegexGroup(String regex) {
        this.regex = regex;
    }
};
