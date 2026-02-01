package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R2\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0015j\b\u0012\u0004\u0012\u00020\r`\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/harman/sdk/message/AdvancedCustomEQPayload;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Lcom/harman/sdk/message/EQCategory;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/message/EQCategory;", "a", "()Lcom/harman/sdk/message/EQCategory;", "d", "(Lcom/harman/sdk/message/EQCategory;)V", "categoryId", "", "F", "B", "c", "()B", "f", "(B)V", "levelScope", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "G", "Ljava/util/ArrayList;", b.f47574c, "()Ljava/util/ArrayList;", "e", "(Ljava/util/ArrayList;)V", "levelList", "<init>", "()V", "H", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AdvancedCustomEQPayload implements Serializable {

    /* renamed from: H, reason: collision with root package name */
    @d
    public static final a f48126H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    public static final byte f48127I = 1;

    /* renamed from: J, reason: collision with root package name */
    public static final byte f48128J = 2;

    /* renamed from: K, reason: collision with root package name */
    public static final byte f48129K = 3;

    /* renamed from: L, reason: collision with root package name */
    public static final byte f48130L = 4;

    /* renamed from: M, reason: collision with root package name */
    public static final byte f48131M = 5;

    /* renamed from: N, reason: collision with root package name */
    public static final byte f48132N = 6;

    /* renamed from: O, reason: collision with root package name */
    public static final byte f48133O = 12;

    /* renamed from: P, reason: collision with root package name */
    public static final byte f48134P = 1;

    /* renamed from: Q, reason: collision with root package name */
    public static final byte f48135Q = 2;

    /* renamed from: R, reason: collision with root package name */
    public static final byte f48136R = 3;

    /* renamed from: S, reason: collision with root package name */
    public static final byte f48137S = 4;

    /* renamed from: T, reason: collision with root package name */
    public static final byte f48138T = 5;

    /* renamed from: U, reason: collision with root package name */
    public static final byte f48139U = 6;

    /* renamed from: V, reason: collision with root package name */
    public static final byte f48140V = 7;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("categoryId")
    @d
    private EQCategory f48141E = EQCategory.CUSTOM;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("levelScope")
    private byte f48142F = 6;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("param")
    @d
    private ArrayList<Byte> f48143G = new ArrayList<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @d
    public final EQCategory a() {
        return this.f48141E;
    }

    @d
    public final ArrayList<Byte> b() {
        return this.f48143G;
    }

    public final byte c() {
        return this.f48142F;
    }

    public final void d(@d EQCategory eQCategory) {
        F.p(eQCategory, "<set-?>");
        this.f48141E = eQCategory;
    }

    public final void e(@d ArrayList<Byte> arrayList) {
        F.p(arrayList, "<set-?>");
        this.f48143G = arrayList;
    }

    public final void f(byte b4) {
        this.f48142F = b4;
    }

    @d
    public String toString() {
        EQCategory eQCategory = this.f48141E;
        byte b4 = this.f48142F;
        return "AdvancedEQSettings(categoryId=" + eQCategory + ", levelScope=" + ((int) b4) + ", levelList=" + this.f48143G + ")";
    }
}
