package com.harman.jbl.partybox.model;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e extends ContentObserver {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final a f42057e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final String f42058f = "AudioContentObserver";

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private f f42059a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final AudioManager f42060b;

    /* renamed from: c, reason: collision with root package name */
    private int f42061c;

    /* renamed from: d, reason: collision with root package name */
    private int f42062d;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(Context context, Handler handler, f fVar, int i4, C2197u c2197u) {
        this(context, handler, (i4 & 4) != 0 ? null : fVar);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        this.f42062d = this.f42060b.getStreamVolume(3);
        if (this.f42061c < 0) {
            this.f42061c = this.f42060b.getStreamMaxVolume(3);
        }
        com.harman.log.f.a(f42058f, "onChange() >>> currentVolume[" + this.f42062d + "] max[" + this.f42061c + "]");
        f fVar = this.f42059a;
        if (fVar != null) {
            fVar.a(this.f42062d, this.f42061c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@l3.d Context context, @l3.e Handler handler, @l3.e f fVar) {
        super(handler);
        F.p(context, "context");
        this.f42059a = fVar;
        this.f42061c = -1;
        this.f42062d = -1;
        Object systemService = context.getSystemService("audio");
        F.n(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f42060b = (AudioManager) systemService;
    }
}
