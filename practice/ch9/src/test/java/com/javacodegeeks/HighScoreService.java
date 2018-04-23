package com.javacodegeeks;
    
import java.util.*;

    public interface HighScoreService {
        List<String> getTopFivePlayers();
        boolean saveHighScore(int score, String playerName);
    }