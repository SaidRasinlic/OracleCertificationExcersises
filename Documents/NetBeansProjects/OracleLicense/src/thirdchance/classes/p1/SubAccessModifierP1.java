package thirdchance.classes.p1;

public class SubAccessModifierP1 extends AccessModifier {

    public static void main(String[] args) {

        AccessModifier superAccess = new AccessModifier();
        System.out.println("Super methods: ");
        superAccess.packagePrivateMethod();
        superAccess.protectedMethod();
        superAccess.publicMethod();

        System.out.println("Sub methods: ");
        SubAccessModifierP1 sbp1 = new SubAccessModifierP1();
        sbp1.packagePrivateMethod();
        sbp1.protectedMethod();
        sbp1.publicMethod();
    }
}
