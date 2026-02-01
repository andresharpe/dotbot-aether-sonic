package com.harman.jbl.cd_biz_comm.logger;

import java.io.File;
import kotlin.jvm.internal.F;
import l3.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f37861a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final File f37862b;

    public c(@l3.d String time, @l3.d File file) {
        F.p(time, "time");
        F.p(file, "file");
        this.f37861a = time;
        this.f37862b = file;
    }

    public static /* synthetic */ c d(c cVar, String str, File file, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cVar.f37861a;
        }
        if ((i4 & 2) != 0) {
            file = cVar.f37862b;
        }
        return cVar.c(str, file);
    }

    @l3.d
    public final String a() {
        return this.f37861a;
    }

    @l3.d
    public final File b() {
        return this.f37862b;
    }

    @l3.d
    public final c c(@l3.d String time, @l3.d File file) {
        F.p(time, "time");
        F.p(file, "file");
        return new c(time, file);
    }

    @l3.d
    public final File e() {
        return this.f37862b;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return F.g(this.f37861a, cVar.f37861a) && F.g(this.f37862b, cVar.f37862b);
    }

    @l3.d
    public final String f() {
        return this.f37861a;
    }

    public int hashCode() {
        return (this.f37861a.hashCode() * 31) + this.f37862b.hashCode();
    }

    @l3.d
    public String toString() {
        return "LogFile(time=" + this.f37861a + ", file=" + this.f37862b + ")";
    }
}
