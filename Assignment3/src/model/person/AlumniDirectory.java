/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class AlumniDirectory {

    public static List<Alumni> alumniDir;

    public AlumniDirectory() {
        alumniDir = new ArrayList<>();
    }

    public static List<Alumni> addAlumni(Alumni alumni) {
        alumniDir.add(alumni);
        return alumniDir;
    }
}
