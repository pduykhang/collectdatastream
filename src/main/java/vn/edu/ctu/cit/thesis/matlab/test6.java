package vn.edu.ctu.cit.thesis.matlab;

import vn.edu.ctu.cit.thesis.kafka.kafkautils.DirUtils;

import java.io.IOException;
import java.util.ArrayList;

public class test6 {
    public static void main(String[] args) {
        try {
            ArrayList<String> files = DirUtils.getListFileName("E:/test fobder/New folder (2)");
            for (String file:files) {
                System.out.println(DirUtils.getFileNameFormPatch(file));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
