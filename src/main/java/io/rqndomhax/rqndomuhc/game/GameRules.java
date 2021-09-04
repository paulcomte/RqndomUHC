/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.rqndomuhc.game;

import io.rqndomhax.rqndomuhc.scenarios.ScenariosManager;
import io.rqndomhax.uhcapi.game.RRules;
import io.rqndomhax.uhcapi.utils.RScenarios;
import io.rqndomhax.uhcapi.utils.RValue;

public class GameRules implements RRules {

    String gameTitle;
    final GameManager gameManager;
    final RValue gameTimers = new RValue();
    final RScenarios scenariosManager = new ScenariosManager();

    public GameRules(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }

    @Override
    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    @Override
    public RValue getTimers() {
        return gameTimers;
    }

    @Override
    public RScenarios getScenarios() {
        return scenariosManager;
    }
}
