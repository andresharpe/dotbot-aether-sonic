package com.harman.jbl.partybox.ui.dashboard;

import androidx.lifecycle.LiveData;
import com.harman.sdk.device.PartyBoxDevice;

/* loaded from: classes2.dex */
public final class DashboardBannerViewModel extends androidx.lifecycle.j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<EnumBannerStyle> f42883H = new androidx.lifecycle.P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<PartyBoxDevice> f42884I = new androidx.lifecycle.P<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel$EnumBannerStyle;", "", "(Ljava/lang/String;I)V", "HOW_TO_FIND_THE_OTHER_SPEAKER", "HOW_TO_SWITCH_TO_STEREO", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EnumBannerStyle {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EnumBannerStyle[] $VALUES;
        public static final EnumBannerStyle HOW_TO_FIND_THE_OTHER_SPEAKER = new EnumBannerStyle("HOW_TO_FIND_THE_OTHER_SPEAKER", 0);
        public static final EnumBannerStyle HOW_TO_SWITCH_TO_STEREO = new EnumBannerStyle("HOW_TO_SWITCH_TO_STEREO", 1);

        static {
            EnumBannerStyle[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private EnumBannerStyle(String str, int i4) {
        }

        private static final /* synthetic */ EnumBannerStyle[] b() {
            return new EnumBannerStyle[]{HOW_TO_FIND_THE_OTHER_SPEAKER, HOW_TO_SWITCH_TO_STEREO};
        }

        @l3.d
        public static kotlin.enums.a<EnumBannerStyle> e() {
            return $ENTRIES;
        }

        public static EnumBannerStyle valueOf(String str) {
            return (EnumBannerStyle) Enum.valueOf(EnumBannerStyle.class, str);
        }

        public static EnumBannerStyle[] values() {
            return (EnumBannerStyle[]) $VALUES.clone();
        }
    }

    @l3.d
    public final LiveData<PartyBoxDevice> u() {
        return this.f42884I;
    }

    @l3.d
    public final LiveData<EnumBannerStyle> v() {
        return this.f42883H;
    }

    @androidx.annotation.K
    public final void w(@l3.d PartyBoxDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        this.f42884I.r(device);
    }

    @androidx.annotation.K
    public final void x(@l3.d EnumBannerStyle style) {
        kotlin.jvm.internal.F.p(style, "style");
        this.f42883H.r(style);
    }
}
