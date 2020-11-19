package demo;

import org.jooq.Allow;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class App {
    @Allow(SQLDialect.H2)
    // @Allow.PlainSQL
    public static void main(String[] args) {
        DSL.condition("true");
    }
}
