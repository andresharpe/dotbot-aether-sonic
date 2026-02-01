package com.harman.jbl.partylight.lib;

import android.bluetooth.le.ScanResult;
import com.harman.jbl.partylight.lib.core.PBDevice;
import com.harman.jbl.partylight.lib.core.PLGroup;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes2.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f46571a = a.f46572a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f46572a = new a();

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private static final f f46573b = com.harman.jbl.partylight.lib.core.d.f46277b;

        private a() {
        }

        @l3.d
        public final f a() {
            return f46573b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(f fVar, List list, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    list = CollectionsKt__CollectionsKt.O(PLGroup.Type.Beam, PLGroup.Type.Stick);
                }
                fVar.d(list);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
        }

        public static /* synthetic */ Object b(f fVar, PLGroup pLGroup, EnterConnectMode enterConnectMode, d dVar, kotlin.coroutines.c cVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    enterConnectMode = EnterConnectMode.CONNECT_BEFORE_ENTER;
                }
                if ((i4 & 4) != 0) {
                    dVar = null;
                }
                return fVar.g(pLGroup, enterConnectMode, dVar, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterPartyLightDashboard");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void c(f fVar, List list, String str, List list2, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    list = CollectionsKt__CollectionsKt.O(PLGroup.Type.Beam, PLGroup.Type.Stick);
                }
                fVar.c(list, str, list2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
    }

    void a(@l3.d ScanResult scanResult);

    void b(@l3.d c cVar);

    void c(@l3.d List<? extends PLGroup.Type> list, @l3.d String str, @l3.d List<PBDevice> list2);

    void d(@l3.d List<? extends PLGroup.Type> list);

    void e(@l3.d PLGroup.Type type);

    void f(@l3.d c cVar);

    @l3.e
    Object g(@l3.d PLGroup pLGroup, @l3.d EnterConnectMode enterConnectMode, @l3.e d dVar, @l3.d kotlin.coroutines.c<? super EnterResp> cVar);
}
