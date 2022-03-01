package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {

        IReader reader = new MyFileReader(
            "DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt");
        IWriter writer = new MyFileWriter(
            "DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt");
        EncodingModule encodingModule = new EncodingModule(reader,writer);
        encodingModule.encode();

        reader = new MyNetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new MyDatabaseWriter();
        EncodingModule encodingModule2 = new EncodingModule(reader,writer);

        encodingModule.encode();
    }
}
