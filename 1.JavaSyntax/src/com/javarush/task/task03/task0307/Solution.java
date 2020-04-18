package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

import java.net.ConnectException;

public class Solution {
    public static void main(String[] args) {
      Zerg zerg1 = new Zerg();
      Zerg zerg2 = new Zerg();
      Zerg zerg3 = new Zerg();
      Zerg zerg4 = new Zerg();
      Zerg zerg5 = new Zerg();

      zerg1.name = "one";
      zerg2.name = "two";
      zerg3.name = "three";
      zerg4.name = "four";
      zerg5.name = "five";

      Protoss protoss1 = new Protoss();
      Protoss protoss2 = new Protoss();
      Protoss protoss3 = new Protoss();

      protoss1.name = "oneP";
      protoss2.name = "twoP";
      protoss3.name = "threeP";

      Terran terran1 = new Terran();
      Terran terran2 = new Terran();
      Terran terran3 = new Terran();
      Terran terran4 = new Terran();

      terran1.name = "oneT";
      terran2.name = "twoT";
      terran3.name = "threeT";
      terran4.name = "fourT";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
