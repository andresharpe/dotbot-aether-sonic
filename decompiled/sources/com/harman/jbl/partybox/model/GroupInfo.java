package com.harman.jbl.partybox.model;

import X2.l;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.TWSInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.E;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.text.C;
import kotlin.text.C2220b;
import kotlin.text.C2222d;
import kotlin.text.z;

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001d\b\u0086\b\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001=B5\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010(\u001a\u00020!¢\u0006\u0004\b;\u0010<J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0005J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010\"\u001a\u00020!HÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010)\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020!HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001dR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u00100R$\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u00100R\u0017\u0010&\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010\u001dR\u0019\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010\u001dR\u0017\u0010(\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010#¨\u0006>"}, d2 = {"Lcom/harman/jbl/partybox/model/GroupInfo;", "", "Ljava/io/Serializable;", "", "x", "(Ljava/lang/String;)Ljava/lang/String;", "", "lmt", "", "m", "(Ljava/lang/String;I)[B", "n", "(Ljava/lang/String;)[B", "other", com.harman.log.b.f47574c, "(Lcom/harman/jbl/partybox/model/GroupInfo;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "deviceMAC", "s", "Lcom/harman/sdk/device/HmDevice;", "harmanDevice", "u", "(Lcom/harman/sdk/device/HmDevice;)Z", "e", "()Ljava/lang/String;", "f", "g", "i", "", "j", "()J", "groupId", "groupName", "masterMac", "slaveMac", "createTime", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/harman/jbl/partybox/model/GroupInfo;", "toString", androidx.exifinterface.media.a.U4, "Ljava/lang/String;", "p", "v", "(Ljava/lang/String;)V", "F", "q", "w", "G", "r", "H", "t", "I", "J", "o", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nGroupInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupInfo.kt\ncom/harman/jbl/partybox/model/GroupInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1#2:95\n1549#3:96\n1620#3,3:97\n*S KotlinDebug\n*F\n+ 1 GroupInfo.kt\ncom/harman/jbl/partybox/model/GroupInfo\n*L\n84#1:96\n84#1:97,3\n*E\n"})
/* loaded from: classes2.dex */
public final class GroupInfo implements Comparable<GroupInfo>, Serializable {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f42028J = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private String f42029E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private String f42030F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final String f42031G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private final String f42032H;

    /* renamed from: I, reason: collision with root package name */
    private final long f42033I;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements l<GroupInfo, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f42034F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d GroupInfo it) {
            F.p(it, "it");
            return it.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<GroupInfo, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f42035F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d GroupInfo it) {
            F.p(it, "it");
            return it.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<GroupInfo, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f42036F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d GroupInfo it) {
            F.p(it, "it");
            return it.t();
        }
    }

    public GroupInfo(@l3.d String groupId, @l3.e String str, @l3.d String masterMac, @l3.e String str2, long j4) {
        F.p(groupId, "groupId");
        F.p(masterMac, "masterMac");
        this.f42029E = groupId;
        this.f42030F = str;
        this.f42031G = masterMac;
        this.f42032H = str2;
        this.f42033I = j4;
    }

    public static /* synthetic */ GroupInfo l(GroupInfo groupInfo, String str, String str2, String str3, String str4, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = groupInfo.f42029E;
        }
        if ((i4 & 2) != 0) {
            str2 = groupInfo.f42030F;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            str3 = groupInfo.f42031G;
        }
        String str6 = str3;
        if ((i4 & 8) != 0) {
            str4 = groupInfo.f42032H;
        }
        String str7 = str4;
        if ((i4 & 16) != 0) {
            j4 = groupInfo.f42033I;
        }
        return groupInfo.k(str, str5, str6, str7, j4);
    }

    private final byte[] m(String str, int i4) {
        boolean S12;
        S12 = z.S1(str);
        if (S12) {
            return new byte[0];
        }
        if (i4 <= 0) {
            byte[] bytes = str.getBytes(C2222d.f52792b);
            F.o(bytes, "getBytes(...)");
            return bytes;
        }
        if (str.length() > i4) {
            str = str.substring(0, i4);
            F.o(str, "substring(...)");
        }
        byte[] bytes2 = str.getBytes(C2222d.f52792b);
        F.o(bytes2, "getBytes(...)");
        return bytes2;
    }

    private final byte[] n(String str) {
        List<String> r6;
        int b02;
        byte[] O5;
        int a4;
        if (str.length() % 2 == 0) {
            r6 = C.r6(str, 2);
            b02 = C2109w.b0(r6, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (String str2 : r6) {
                a4 = C2220b.a(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, a4)));
            }
            O5 = D.O5(arrayList);
            return O5;
        }
        throw new IllegalStateException("Must have an even length".toString());
    }

    private final String x(String str) {
        byte[] m4;
        try {
            m4 = n(str);
        } catch (Exception unused) {
            m4 = m(str, 8);
        }
        String g4 = com.harman.sdk.utils.g.g(m4);
        F.o(g4, "encodeHexStr(...)");
        String substring = g4.substring(0, 2);
        F.o(substring, "substring(...)");
        return substring;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l3.d GroupInfo other) {
        int o4;
        F.p(other, "other");
        o4 = kotlin.comparisons.g.o(this, other, b.f42034F, c.f42035F, d.f42036F);
        return o4;
    }

    @l3.d
    public final String e() {
        return this.f42029E;
    }

    public boolean equals(@l3.e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!F.g(GroupInfo.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.model.GroupInfo");
        GroupInfo groupInfo = (GroupInfo) obj;
        if (F.g(this.f42029E, groupInfo.f42029E) && F.g(this.f42030F, groupInfo.f42030F) && F.g(this.f42031G, groupInfo.f42031G) && F.g(this.f42032H, groupInfo.f42032H)) {
            return true;
        }
        return false;
    }

    @l3.e
    public final String f() {
        return this.f42030F;
    }

    @l3.d
    public final String g() {
        return this.f42031G;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((this.f42029E.hashCode() * 31) + this.f42031G.hashCode()) * 31;
        String str = this.f42032H;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @l3.e
    public final String i() {
        return this.f42032H;
    }

    public final long j() {
        return this.f42033I;
    }

    @l3.d
    public final GroupInfo k(@l3.d String groupId, @l3.e String str, @l3.d String masterMac, @l3.e String str2, long j4) {
        F.p(groupId, "groupId");
        F.p(masterMac, "masterMac");
        return new GroupInfo(groupId, str, masterMac, str2, j4);
    }

    public final long o() {
        return this.f42033I;
    }

    @l3.d
    public final String p() {
        return this.f42029E;
    }

    @l3.e
    public final String q() {
        return this.f42030F;
    }

    @l3.d
    public final String r() {
        return this.f42031G;
    }

    @l3.e
    public final String s(@l3.d String deviceMAC) {
        F.p(deviceMAC, "deviceMAC");
        if (F.g(deviceMAC, this.f42031G)) {
            return this.f42032H;
        }
        if (F.g(deviceMAC, this.f42032H)) {
            return this.f42031G;
        }
        return "";
    }

    @l3.e
    public final String t() {
        return this.f42032H;
    }

    @l3.d
    public String toString() {
        return "GroupInfo(groupId=" + this.f42029E + ", groupName=" + this.f42030F + ", masterMac=" + this.f42031G + ", slaveMac=" + this.f42032H + ", createTime=" + this.f42033I + ")";
    }

    public final boolean u(@l3.d HmDevice harmanDevice) {
        String str;
        boolean K12;
        String a4;
        F.p(harmanDevice, "harmanDevice");
        TWSInfo M3 = harmanDevice.M();
        if (M3 != null && (a4 = M3.a()) != null) {
            str = x(a4);
        } else {
            str = null;
        }
        K12 = z.K1(this.f42029E, str, true);
        if (K12 && (F.g(harmanDevice.n(), this.f42031G) || F.g(harmanDevice.n(), this.f42032H))) {
            return true;
        }
        return false;
    }

    public final void v(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f42029E = str;
    }

    public final void w(@l3.e String str) {
        this.f42030F = str;
    }

    public /* synthetic */ GroupInfo(String str, String str2, String str3, String str4, long j4, int i4, C2197u c2197u) {
        this(str, str2, str3, str4, (i4 & 16) != 0 ? System.currentTimeMillis() : j4);
    }
}
