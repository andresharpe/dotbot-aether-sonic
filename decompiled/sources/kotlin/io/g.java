package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final File f52142a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final List<File> f52143b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@l3.d File root, @l3.d List<? extends File> segments) {
        F.p(root, "root");
        F.p(segments, "segments");
        this.f52142a = root;
        this.f52143b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g d(g gVar, File file, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            file = gVar.f52142a;
        }
        if ((i4 & 2) != 0) {
            list = gVar.f52143b;
        }
        return gVar.c(file, list);
    }

    @l3.d
    public final File a() {
        return this.f52142a;
    }

    @l3.d
    public final List<File> b() {
        return this.f52143b;
    }

    @l3.d
    public final g c(@l3.d File root, @l3.d List<? extends File> segments) {
        F.p(root, "root");
        F.p(segments, "segments");
        return new g(root, segments);
    }

    @l3.d
    public final File e() {
        return this.f52142a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return F.g(this.f52142a, gVar.f52142a) && F.g(this.f52143b, gVar.f52143b);
    }

    @l3.d
    public final String f() {
        String path = this.f52142a.getPath();
        F.o(path, "getPath(...)");
        return path;
    }

    @l3.d
    public final List<File> g() {
        return this.f52143b;
    }

    public final int h() {
        return this.f52143b.size();
    }

    public int hashCode() {
        return (this.f52142a.hashCode() * 31) + this.f52143b.hashCode();
    }

    public final boolean i() {
        String path = this.f52142a.getPath();
        F.o(path, "getPath(...)");
        if (path.length() > 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public final File j(int i4, int i5) {
        String m32;
        if (i4 >= 0 && i4 <= i5 && i5 <= h()) {
            List<File> subList = this.f52143b.subList(i4, i5);
            String separator = File.separator;
            F.o(separator, "separator");
            m32 = D.m3(subList, separator, null, null, 0, null, null, 62, null);
            return new File(m32);
        }
        throw new IllegalArgumentException();
    }

    @l3.d
    public String toString() {
        return "FilePathComponents(root=" + this.f52142a + ", segments=" + this.f52143b + ')';
    }
}
