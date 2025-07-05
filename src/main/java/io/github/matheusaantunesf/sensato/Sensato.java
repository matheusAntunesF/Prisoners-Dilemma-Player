/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.matheusaantunesf.sensato;

import io.github.guisso.meleeinterface.IPlayer;
import io.github.guisso.meleeinterface.Decision;
/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class Sensato
   implements IPlayer{

    @Override
    public String getDeveloperName() {
        return "Matheus Antunes";
    }

    @Override
    public String getEngineName() {
        return "Sensato";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        if(Decision.byValue(opponentPreviousMove.getValue()) == Decision.NONE){
            return Decision.COOPERATE;
        } else if (Decision.byValue(opponentPreviousMove.getValue())
                == Decision.COOPERATE){
            return Decision.COOPERATE;
        } else {
            return Decision.DEFECT;
        }
    }
}
