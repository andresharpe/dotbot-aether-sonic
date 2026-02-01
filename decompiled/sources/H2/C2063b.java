package h2;

import com.harman.jbl.cd_biz_comm.utils.i;
import com.harman.jbl.cd_biz_comm.utils.j;
import com.harman.jbl.partylight.lib.biz.AuracastMode;
import com.harman.jbl.partylight.lib.biz.Switch;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.A;
import kotlin.collections.C2101p;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2063b {

    /* renamed from: f, reason: collision with root package name */
    @d
    public static final a f50735f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @e
    private final AuracastMode f50736a;

    /* renamed from: b, reason: collision with root package name */
    @e
    private final Switch f50737b;

    /* renamed from: c, reason: collision with root package name */
    @e
    private final Switch f50738c;

    /* renamed from: d, reason: collision with root package name */
    @e
    private final String f50739d;

    /* renamed from: e, reason: collision with root package name */
    @e
    private final Short f50740e;

    @U({"SMAP\nTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Types.kt\ncom/harman/jbl/partylight/lib/biz/LightDevInfo$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    /* renamed from: h2.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final C2063b a(@d byte[] bytes) {
            List Ny;
            Object M02;
            Switch r32;
            Object B22;
            AuracastMode auracastMode;
            Object B23;
            Object B24;
            byte[] O5;
            byte[] O52;
            F.p(bytes, "bytes");
            try {
                C2063b c2063b = new C2063b(null, null, null, null, null, 31, null);
                Ny = C2101p.Ny(bytes);
                M02 = A.M0(Ny);
                ((Number) M02).byteValue();
                Iterator it = Ny.iterator();
                C2063b c2063b2 = c2063b;
                while (it.hasNext()) {
                    byte byteValue = ((Number) it.next()).byteValue();
                    List b4 = i.b(it, ((Number) it.next()).byteValue());
                    Switch r4 = null;
                    int i4 = 0;
                    if (byteValue == 69) {
                        Switch[] values = Switch.values();
                        int length = values.length;
                        while (true) {
                            if (i4 < length) {
                                Switch r6 = values[i4];
                                byte f4 = r6.f();
                                B22 = D.B2(b4);
                                if (f4 == ((Number) B22).byteValue()) {
                                    r32 = r6;
                                    break;
                                }
                                i4++;
                            } else {
                                r32 = null;
                                break;
                            }
                        }
                        c2063b2 = C2063b.g(c2063b2, null, r32, null, null, null, 29, null);
                    } else if (byteValue == 60) {
                        AuracastMode[] values2 = AuracastMode.values();
                        int length2 = values2.length;
                        while (true) {
                            if (i4 < length2) {
                                AuracastMode auracastMode2 = values2[i4];
                                byte f5 = auracastMode2.f();
                                B23 = D.B2(b4);
                                if (f5 == ((Number) B23).byteValue()) {
                                    auracastMode = auracastMode2;
                                    break;
                                }
                                i4++;
                            } else {
                                auracastMode = null;
                                break;
                            }
                        }
                        c2063b2 = C2063b.g(c2063b2, auracastMode, null, null, null, null, 30, null);
                    } else if (byteValue == 70) {
                        Switch[] values3 = Switch.values();
                        int length3 = values3.length;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            Switch r62 = values3[i4];
                            byte f6 = r62.f();
                            B24 = D.B2(b4);
                            if (f6 == ((Number) B24).byteValue()) {
                                r4 = r62;
                                break;
                            }
                            i4++;
                        }
                        c2063b2 = C2063b.g(c2063b2, null, null, r4, null, null, 27, null);
                    } else if (byteValue == 64) {
                        O5 = D.O5(b4);
                        c2063b2 = C2063b.g(c2063b2, null, null, null, j.k(i.f(O5)), null, 23, null);
                    } else if (byteValue == 74) {
                        O52 = D.O5(b4);
                        c2063b2 = C2063b.g(c2063b2, null, null, null, null, Short.valueOf(ByteBuffer.wrap(O52).getShort()), 15, null);
                    }
                }
                return c2063b2;
            } catch (Throwable th) {
                th.printStackTrace();
                return new C2063b(null, null, null, null, null, 31, null);
            }
        }

        private a() {
        }
    }

    public C2063b() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ C2063b g(C2063b c2063b, AuracastMode auracastMode, Switch r5, Switch r6, String str, Short sh, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            auracastMode = c2063b.f50736a;
        }
        if ((i4 & 2) != 0) {
            r5 = c2063b.f50737b;
        }
        Switch r10 = r5;
        if ((i4 & 4) != 0) {
            r6 = c2063b.f50738c;
        }
        Switch r02 = r6;
        if ((i4 & 8) != 0) {
            str = c2063b.f50739d;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            sh = c2063b.f50740e;
        }
        return c2063b.f(auracastMode, r10, r02, str2, sh);
    }

    @e
    public final AuracastMode a() {
        return this.f50736a;
    }

    @e
    public final Switch b() {
        return this.f50737b;
    }

    @e
    public final Switch c() {
        return this.f50738c;
    }

    @e
    public final String d() {
        return this.f50739d;
    }

    @e
    public final Short e() {
        return this.f50740e;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2063b)) {
            return false;
        }
        C2063b c2063b = (C2063b) obj;
        if (this.f50736a == c2063b.f50736a && this.f50737b == c2063b.f50737b && this.f50738c == c2063b.f50738c && F.g(this.f50739d, c2063b.f50739d) && F.g(this.f50740e, c2063b.f50740e)) {
            return true;
        }
        return false;
    }

    @d
    public final C2063b f(@e AuracastMode auracastMode, @e Switch r9, @e Switch r10, @e String str, @e Short sh) {
        return new C2063b(auracastMode, r9, r10, str, sh);
    }

    @d
    public final C2063b h(@d C2063b data) {
        F.p(data, "data");
        AuracastMode auracastMode = data.f50736a;
        if (auracastMode == null) {
            auracastMode = this.f50736a;
        }
        AuracastMode auracastMode2 = auracastMode;
        Switch r12 = data.f50737b;
        if (r12 == null) {
            r12 = this.f50737b;
        }
        Switch r32 = r12;
        Switch r13 = data.f50738c;
        if (r13 == null) {
            r13 = this.f50738c;
        }
        Switch r4 = r13;
        String str = data.f50739d;
        if (str == null) {
            str = this.f50739d;
        }
        String str2 = str;
        Short sh = data.f50740e;
        if (sh == null) {
            sh = this.f50740e;
        }
        return new C2063b(auracastMode2, r32, r4, str2, sh);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        AuracastMode auracastMode = this.f50736a;
        int i4 = 0;
        if (auracastMode == null) {
            hashCode = 0;
        } else {
            hashCode = auracastMode.hashCode();
        }
        int i5 = hashCode * 31;
        Switch r22 = this.f50737b;
        if (r22 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r22.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Switch r23 = this.f50738c;
        if (r23 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r23.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        String str = this.f50739d;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        Short sh = this.f50740e;
        if (sh != null) {
            i4 = sh.hashCode();
        }
        return i8 + i4;
    }

    @e
    public final AuracastMode i() {
        return this.f50736a;
    }

    @e
    public final Switch j() {
        return this.f50738c;
    }

    @e
    public final String k() {
        return this.f50739d;
    }

    @e
    public final Switch l() {
        return this.f50737b;
    }

    @e
    public final Short m() {
        return this.f50740e;
    }

    public final boolean n() {
        Short sh = this.f50740e;
        if (sh != null && (sh == null || sh.shortValue() != 0)) {
            return true;
        }
        return false;
    }

    @d
    public String toString() {
        return "LightDevInfo(auracastMode=" + this.f50736a + ", soundDetection=" + this.f50737b + ", danceMode=" + this.f50738c + ", devSerialNumber=" + this.f50739d + ", stageGroupId=" + this.f50740e + ")";
    }

    public /* synthetic */ C2063b(AuracastMode auracastMode, Switch r6, Switch r7, String str, Short sh, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : auracastMode, (i4 & 2) != 0 ? null : r6, (i4 & 4) != 0 ? null : r7, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : sh);
    }

    public C2063b(@e AuracastMode auracastMode, @e Switch r22, @e Switch r32, @e String str, @e Short sh) {
        this.f50736a = auracastMode;
        this.f50737b = r22;
        this.f50738c = r32;
        this.f50739d = str;
        this.f50740e = sh;
    }
}
