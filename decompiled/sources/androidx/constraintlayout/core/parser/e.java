package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: L, reason: collision with root package name */
    float f7606L;

    public e(char[] cArr) {
        super(cArr);
        this.f7606L = Float.NaN;
    }

    public static c x(char[] cArr) {
        return new e(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public float j() {
        if (Float.isNaN(this.f7606L)) {
            this.f7606L = Float.parseFloat(c());
        }
        return this.f7606L;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int k() {
        if (Float.isNaN(this.f7606L)) {
            this.f7606L = Integer.parseInt(c());
        }
        return (int) this.f7606L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String v(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        b(sb, i4);
        float j4 = j();
        int i6 = (int) j4;
        if (i6 == j4) {
            sb.append(i6);
        } else {
            sb.append(j4);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.c
    public String w() {
        float j4 = j();
        int i4 = (int) j4;
        if (i4 == j4) {
            StringBuilder sb = new StringBuilder();
            sb.append(i4);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j4);
        return sb2.toString();
    }

    public boolean y() {
        if (((int) r0) == j()) {
            return true;
        }
        return false;
    }

    public void z(float f4) {
        this.f7606L = f4;
    }

    public e(float f4) {
        super(null);
        this.f7606L = f4;
    }
}
