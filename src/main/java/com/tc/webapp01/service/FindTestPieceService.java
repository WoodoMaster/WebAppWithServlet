package com.tc.webapp01.service;

import com.tc.webapp01.entity.TestPiece;

import java.util.List;

public interface FindTestPieceService {
    List<TestPiece> find (TestPiece testPiece);
}
