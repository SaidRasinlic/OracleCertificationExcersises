package thirdchance.classes.p2;

import thirdchance.classes.p1.AccessModifier;

public class SubAccessModifier extends AccessModifier {

    public static void main(String[] args) {

        AccessModifier superAccess = new AccessModifier();
        System.out.println("Super methods: ");
        superAccess.publicMethod();

        SubAccessModifier sub = new SubAccessModifier();
        System.out.println("Sub methods: ");
        sub.protectedMethod();
        sub.publicMethod();
    }
}
