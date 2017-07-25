package DAO;

import Entity.ScoreRequest;

import java.util.Date;

/**
 * Copyright (c) 2017 Peter Mao. All rights reserved.
 * Created by mao on 17-7-25.
 */
public interface ScoreRequestDAO {
    void addRequest(ScoreRequest request);

    void updateRequest(ScoreRequest request);

    ScoreRequest findRequest(String zjh, String mm, Date date);

}
