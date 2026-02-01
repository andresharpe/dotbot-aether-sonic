package com.harman.sdk.message;

import androidx.core.app.C0;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.utils.k;
import java.io.Serializable;
import java.util.LinkedList;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 (2\u00020\u0001:\u0002\u0010)B\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013¨\u0006*"}, d2 = {"Lcom/harman/sdk/message/SimpleEQSettings;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", androidx.exifinterface.media.a.U4, "B", "a", "()B", "e", "(B)V", "categoryId", "F", "d", "h", C0.f11537F0, "Ljava/util/LinkedList;", "Lcom/harman/sdk/message/SimpleEQSettings$Parameter;", "G", "Ljava/util/LinkedList;", b.f47574c, "()Ljava/util/LinkedList;", "f", "(Ljava/util/LinkedList;)V", "param", "H", "c", "g", com.spotify.sdk.android.auth.a.f48959e, "<init>", "()V", "I", "Parameter", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SimpleEQSettings implements Serializable {

    /* renamed from: I, reason: collision with root package name */
    @d
    public static final a f48292I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    public static final byte f48293J = 1;

    /* renamed from: K, reason: collision with root package name */
    public static final byte f48294K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final byte f48295L = 1;

    /* renamed from: M, reason: collision with root package name */
    public static final byte f48296M = 2;

    /* renamed from: N, reason: collision with root package name */
    public static final byte f48297N = 3;

    /* renamed from: O, reason: collision with root package name */
    public static final byte f48298O = 4;

    /* renamed from: P, reason: collision with root package name */
    public static final byte f48299P = 5;

    /* renamed from: Q, reason: collision with root package name */
    public static final byte f48300Q = -63;

    /* renamed from: R, reason: collision with root package name */
    public static final byte f48301R = -62;

    /* renamed from: S, reason: collision with root package name */
    public static final byte f48302S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final byte f48303T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final byte f48304U = 1;

    /* renamed from: V, reason: collision with root package name */
    public static final byte f48305V = 2;

    /* renamed from: W, reason: collision with root package name */
    public static final byte f48306W = 3;

    /* renamed from: X, reason: collision with root package name */
    public static final byte f48307X = 1;

    /* renamed from: Y, reason: collision with root package name */
    public static final byte f48308Y = 2;

    /* renamed from: Z, reason: collision with root package name */
    public static final byte f48309Z = 3;

    /* renamed from: a0, reason: collision with root package name */
    public static final byte f48310a0 = 4;

    /* renamed from: b0, reason: collision with root package name */
    public static final byte f48311b0 = 5;

    /* renamed from: c0, reason: collision with root package name */
    public static final byte f48312c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte f48313d0 = 2;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("categoryId")
    private byte f48314E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName(C0.f11537F0)
    private byte f48315F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("param")
    @d
    private LinkedList<Parameter> f48316G = new LinkedList<>();

    /* renamed from: H, reason: collision with root package name */
    @SerializedName(com.spotify.sdk.android.auth.a.f48959e)
    private byte f48317H = 2;

    @E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/harman/sdk/message/SimpleEQSettings$Parameter;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", androidx.exifinterface.media.a.U4, "B", "a", "()B", "c", "(B)V", "type", "F", b.f47574c, "d", "value", "<init>", "(BB)V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Parameter implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        private byte f48318E;

        /* renamed from: F, reason: collision with root package name */
        private byte f48319F;

        public Parameter(byte b4, byte b5) {
            this.f48318E = b4;
            this.f48319F = b5;
        }

        public final byte a() {
            return this.f48318E;
        }

        public final byte b() {
            return this.f48319F;
        }

        public final void c(byte b4) {
            this.f48318E = b4;
        }

        public final void d(byte b4) {
            this.f48319F = b4;
        }

        public boolean equals(@e Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!F.g(Parameter.class, cls)) {
                return false;
            }
            F.n(obj, "null cannot be cast to non-null type com.harman.sdk.message.SimpleEQSettings.Parameter");
            Parameter parameter = (Parameter) obj;
            if (this.f48318E == parameter.f48318E && this.f48319F == parameter.f48319F) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (byte) ((this.f48318E * k.f48669h0) + this.f48319F);
        }

        @d
        public String toString() {
            return "Parameter(type=" + ((int) this.f48318E) + ", value=" + ((int) this.f48319F) + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public final byte a() {
        return this.f48314E;
    }

    @d
    public final LinkedList<Parameter> b() {
        return this.f48316G;
    }

    public final byte c() {
        return this.f48317H;
    }

    public final byte d() {
        return this.f48315F;
    }

    public final void e(byte b4) {
        this.f48314E = b4;
    }

    public boolean equals(@e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!F.g(SimpleEQSettings.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.sdk.message.SimpleEQSettings");
        SimpleEQSettings simpleEQSettings = (SimpleEQSettings) obj;
        if (this.f48314E == simpleEQSettings.f48314E && this.f48315F == simpleEQSettings.f48315F && F.g(this.f48316G, simpleEQSettings.f48316G) && this.f48317H == simpleEQSettings.f48317H) {
            return true;
        }
        return false;
    }

    public final void f(@d LinkedList<Parameter> linkedList) {
        F.p(linkedList, "<set-?>");
        this.f48316G = linkedList;
    }

    public final void g(byte b4) {
        this.f48317H = b4;
    }

    public final void h(byte b4) {
        this.f48315F = b4;
    }

    public int hashCode() {
        return (((((this.f48314E * k.f48669h0) + this.f48315F) * 31) + this.f48316G.hashCode()) * 31) + this.f48317H;
    }

    @d
    public String toString() {
        byte b4 = this.f48314E;
        byte b5 = this.f48315F;
        byte b6 = this.f48317H;
        return "GeneralEQSettings(categoryId=" + ((int) b4) + ", status=" + ((int) b5) + ", scope=" + ((int) b6) + ", param=" + this.f48316G + ")";
    }
}
