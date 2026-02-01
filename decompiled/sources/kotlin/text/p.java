package kotlin.text;

/* loaded from: classes2.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final p f52855a = new p();

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final Regex f52856b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f52856b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private p() {
    }
}
