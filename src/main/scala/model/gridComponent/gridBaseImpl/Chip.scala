package de.htwg.se.VierGewinnt.model

import io.AnsiColor.* 

enum Chip(value: Int, colorCode: String):
    def getValue: Int = value
    def getColorCode: String = colorCode
    
    case EMPTY extends Chip(0, BLUE_B)
    case RED extends Chip(1, RED_B)
    case YELLOW extends Chip(2, YELLOW_B)