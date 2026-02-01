package junit.framework;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static final String f51499f = "...";

    /* renamed from: g, reason: collision with root package name */
    private static final String f51500g = "]";

    /* renamed from: h, reason: collision with root package name */
    private static final String f51501h = "[";

    /* renamed from: a, reason: collision with root package name */
    private int f51502a;

    /* renamed from: b, reason: collision with root package name */
    private String f51503b;

    /* renamed from: c, reason: collision with root package name */
    private String f51504c;

    /* renamed from: d, reason: collision with root package name */
    private int f51505d;

    /* renamed from: e, reason: collision with root package name */
    private int f51506e;

    public b(int i4, String str, String str2) {
        this.f51502a = i4;
        this.f51503b = str;
        this.f51504c = str2;
    }

    private boolean a() {
        return this.f51503b.equals(this.f51504c);
    }

    private String c(String str) {
        String str2 = f51501h + str.substring(this.f51505d, (str.length() - this.f51506e) + 1) + f51500g;
        if (this.f51505d > 0) {
            str2 = d() + str2;
        }
        if (this.f51506e > 0) {
            return str2 + e();
        }
        return str2;
    }

    private String d() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f51505d > this.f51502a) {
            str = f51499f;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(this.f51503b.substring(Math.max(0, this.f51505d - this.f51502a), this.f51505d));
        return sb.toString();
    }

    private String e() {
        String str;
        int min = Math.min((this.f51503b.length() - this.f51506e) + 1 + this.f51502a, this.f51503b.length());
        StringBuilder sb = new StringBuilder();
        String str2 = this.f51503b;
        sb.append(str2.substring((str2.length() - this.f51506e) + 1, min));
        if ((this.f51503b.length() - this.f51506e) + 1 < this.f51503b.length() - this.f51502a) {
            str = f51499f;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    private void f() {
        this.f51505d = 0;
        int min = Math.min(this.f51503b.length(), this.f51504c.length());
        while (true) {
            int i4 = this.f51505d;
            if (i4 < min && this.f51503b.charAt(i4) == this.f51504c.charAt(this.f51505d)) {
                this.f51505d++;
            } else {
                return;
            }
        }
    }

    private void g() {
        int length = this.f51503b.length() - 1;
        int length2 = this.f51504c.length() - 1;
        while (true) {
            int i4 = this.f51505d;
            if (length2 < i4 || length < i4 || this.f51503b.charAt(length) != this.f51504c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f51506e = this.f51503b.length() - length;
    }

    public String b(String str) {
        if (this.f51503b != null && this.f51504c != null && !a()) {
            f();
            g();
            return a.N(str, c(this.f51503b), c(this.f51504c));
        }
        return a.N(str, this.f51503b, this.f51504c);
    }
}
