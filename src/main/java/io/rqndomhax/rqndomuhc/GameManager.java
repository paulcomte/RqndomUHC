/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.rqndomuhc;

import io.rqndomhax.uhcapi.IRules;
import io.rqndomhax.uhcapi.IScoreboard;
import io.rqndomhax.uhcapi.UHCAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class GameManager implements UHCAPI {

    final GameScoreboard gameScoreboard;
    final GameRules gameRules;
    final JavaPlugin plugin;

    public GameManager(JavaPlugin plugin) {
        this.plugin = plugin;
        this.gameScoreboard = new GameScoreboard(this);
        this.gameRules = new GameRules(this);
    }

    @Override
    public JavaPlugin getPlugin() {
        return plugin;
    }

    @Override
    public IScoreboard getScoreboard() {
        return gameScoreboard;
    }

    @Override
    public IRules getRules() {
        return gameRules;
    }
}
