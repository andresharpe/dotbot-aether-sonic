package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.E;
import kotlin.jvm.internal.C2197u;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", androidx.exifinterface.media.a.U4, "Ljava/io/File;", "a", "()Ljava/io/File;", "file", "F", com.harman.log.b.f47574c, "other", "", "G", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "reason", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FileSystemException extends IOException {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final File f52099E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final File f52100F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final String f52101G;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i4, C2197u c2197u) {
        this(file, (i4 & 2) != 0 ? null : file2, (i4 & 4) != 0 ? null : str);
    }

    @l3.d
    public final File a() {
        return this.f52099E;
    }

    @l3.e
    public final File b() {
        return this.f52100F;
    }

    @l3.e
    public final String c() {
        return this.f52101G;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FileSystemException(@l3.d java.io.File r2, @l3.e java.io.File r3, @l3.e java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.F.p(r2, r0)
            java.lang.String r0 = kotlin.io.e.a(r2, r3, r4)
            r1.<init>(r0)
            r1.f52099E = r2
            r1.f52100F = r3
            r1.f52101G = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
