package com.demo.lombok;

import java.util.Collection;
import java.util.Set;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:59
 */
public class BuilderExample4Java {
    private long created;
    private String name;
    private int age;
    private Set<String> occupations;

    BuilderExample4Java(String name, int age, Set<String> occupations) {
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    private static long $default$created() {
        return System.currentTimeMillis();
    }

    public static BuilderExample4JavaBuilder builder() {
        return new BuilderExample4JavaBuilder();
    }

    public static class BuilderExample4JavaBuilder {
        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private java.util.ArrayList<String> occupations;

        BuilderExample4JavaBuilder() {
        }

        public BuilderExample4JavaBuilder created(long created) {
            this.created = created;
            this.created$set = true;
            return this;
        }

        public BuilderExample4JavaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderExample4JavaBuilder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderExample4JavaBuilder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.add(occupation);
            return this;
        }

        public BuilderExample4JavaBuilder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.addAll(occupations);
            return this;
        }

        public BuilderExample4JavaBuilder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }

            return this;
        }

        /*
        public BuilderExample4Java build() {
            // complicated switch statement to produce a compact properly sized immutable set omitted.
            Set<String> occupations = ...;
            return new BuilderExample4Java(created$set ? created : BuilderExample4Java.$default$created(), name, age, occupations);
        }
        */

        @java.lang.Override
        public String toString() {
            return "BuilderExample4Java.BuilderExample4JavaBuilder(created = " + this.created + ", name = " + this.name + ", age = " + this.age + ", occupations = " + this.occupations + ")";
        }
    }
}
