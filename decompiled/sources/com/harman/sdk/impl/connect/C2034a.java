package com.harman.sdk.impl.connect;

import com.harman.sdk.device.HmDevice;
import java.util.Objects;

/* renamed from: com.harman.sdk.impl.connect.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2034a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final HmDevice f47944a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.a f47945b;

    public C2034a(@l3.d HmDevice device, @l3.d com.harman.sdk.a command) {
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(command, "command");
        this.f47944a = device;
        this.f47945b = command;
    }

    @l3.d
    public final com.harman.sdk.a a() {
        return this.f47945b;
    }

    @l3.d
    public final HmDevice b() {
        return this.f47944a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.F.g(C2034a.class, obj.getClass())) {
            return false;
        }
        C2034a c2034a = (C2034a) obj;
        if (kotlin.jvm.internal.F.g(this.f47944a, c2034a.f47944a) && kotlin.jvm.internal.F.g(this.f47945b, c2034a.f47945b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f47944a, this.f47945b);
    }

    @l3.d
    public String toString() {
        return "CacheCommand(command=" + this.f47945b + ")";
    }
}
