package io.github.vinccool96.algorithms;

import io.github.vinccool96.junit4.generator.generator.Generator;

public class AllTestsGenerator {

    public static void main(String[] args) {
        String currentFolder = "src/test/java/io/github/vinccool96/algorithms";
        String currentPackage = "io.github.vinccool96.algorithms";
        String pathToFirstPackage = "src/test/java/";
        Generator generator = new Generator(currentFolder, currentPackage, pathToFirstPackage);
        generator.generate();
    }

}
