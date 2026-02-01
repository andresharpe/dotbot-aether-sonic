package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import kotlin.E;

@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "Ljava/io/Serializable;", "", androidx.exifinterface.media.a.U4, "B", b.f47574c, "()B", "d", "(B)V", "buttonId", "F", "a", "c", "action", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OneTouchMusicButtonSettings implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("buttonId")
    private byte f48276E = 1;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("action")
    private byte f48277F = 1;

    public final byte a() {
        return this.f48277F;
    }

    public final byte b() {
        return this.f48276E;
    }

    public final void c(byte b4) {
        this.f48277F = b4;
    }

    public final void d(byte b4) {
        this.f48276E = b4;
    }
}
