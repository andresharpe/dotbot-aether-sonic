package com.harman.jbl.partylight.lib.productinfo.command;

import com.harman.jbl.cd_biz_comm.utils.i;
import com.harman.jbl.partylight.lib.core.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.collections.AbstractC2105s;
import kotlin.collections.D;
import kotlin.jvm.internal.C2186i;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @d
    public static final a f47529b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f47530a;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final b a(@d byte[] data) {
            byte[] O5;
            F.p(data, "data");
            C2197u c2197u = null;
            int i4 = 1;
            int i5 = 0;
            try {
                b bVar = new b(i5, i4, c2197u);
                AbstractC2105s b4 = C2186i.b(data);
                while (b4.hasNext()) {
                    byte c4 = b4.c();
                    List b5 = i.b(b4, b4.c());
                    if (c4 == com.harman.jbl.partylight.lib.productinfo.command.a.TOTAL_POWER_DURATION_MINUTES.f()) {
                        O5 = D.O5(b5);
                        bVar = bVar.b(ByteBuffer.wrap(O5).order(ByteOrder.LITTLE_ENDIAN).getInt());
                    }
                }
                return bVar;
            } catch (Exception e4) {
                com.harman.jbl.cd_biz_comm.logger.d.b(e.f46287c, "BatteryStatusInfo parse fail " + e4);
                return new b(i5, i4, c2197u);
            }
        }

        private a() {
        }
    }

    public b() {
        this(0, 1, null);
    }

    public static /* synthetic */ b c(b bVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = bVar.f47530a;
        }
        return bVar.b(i4);
    }

    public final int a() {
        return this.f47530a;
    }

    @d
    public final b b(int i4) {
        return new b(i4);
    }

    public final int d() {
        return this.f47530a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f47530a == ((b) obj).f47530a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f47530a);
    }

    @d
    public String toString() {
        return "BatteryStatusInfo(totalPowerDurationMinutes=" + this.f47530a + ")";
    }

    public b(int i4) {
        this.f47530a = i4;
    }

    public /* synthetic */ b(int i4, int i5, C2197u c2197u) {
        this((i5 & 1) != 0 ? 0 : i4);
    }
}
