package org.example.seminar3.HW.Interfaces;

import org.example.seminar3.HW.Relation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public interface IioStream {
    void save(DataOutputStream stream_out) throws IOException;

    void load(DataInputStream stream_in) throws IOException;

    int getID2();


}
