package com.harman.jbl.partybox.ui;

import com.harman.jbl.partylight.lib.EnterResp;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.coroutines.c;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final C0362a f42082a = C0362a.f42083a;

    /* renamed from: com.harman.jbl.partybox.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0362a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0362a f42083a = new C0362a();

        /* renamed from: b, reason: collision with root package name */
        @d
        private static final a f42084b = b.f42111b;

        private C0362a() {
        }

        @d
        public final a a() {
            return f42084b;
        }
    }

    @e
    Object a(@d c<? super EnterResp> cVar);

    @e
    Object b(@d PartyBoxDevice partyBoxDevice, @d c<? super EnterResp> cVar);
}
