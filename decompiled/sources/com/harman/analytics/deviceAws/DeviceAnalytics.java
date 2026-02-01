package com.harman.analytics.deviceAws;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.text.A;
import kotlin.text.z;
import l3.d;

@E(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b[\u0010\\J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\f\u0010\nR>\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0011\u0010\u0015R>\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0015R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0003\u001a\u0004\b#\u0010\b\"\u0004\b\u0017\u0010\nR(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R>\u00104\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050-j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b\u0006\u00103R\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0004\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u0010\u0004\"\u0004\b=\u00109R\"\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u0010\u0004\"\u0004\bA\u00109R\"\u0010F\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00106\u001a\u0004\bD\u0010\u0004\"\u0004\bE\u00109R\"\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00106\u001a\u0004\bH\u0010\u0004\"\u0004\bI\u00109R\"\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u00106\u001a\u0004\bL\u0010\u0004\"\u0004\bM\u00109R\"\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u00106\u001a\u0004\bP\u0010\u0004\"\u0004\bQ\u00109R\"\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u00106\u001a\u0004\bT\u0010\u0004\"\u0004\bU\u00109R\"\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u00106\u001a\u0004\bX\u0010\u0004\"\u0004\bY\u00109¨\u0006]"}, d2 = {"Lcom/harman/analytics/deviceAws/DeviceAnalytics;", "Ljava/io/Serializable;", "", "I", "()Ljava/lang/String;", "", androidx.exifinterface.media.a.U4, "k", "()I", "B", "(I)V", "deviceIdxToken", "F", "o", "packageTotal", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "G", "Ljava/util/HashMap;", "p", "()Ljava/util/HashMap;", "(Ljava/util/HashMap;)V", "packages", "H", "l", "C", "features", "", "Z", "a", "()Z", "r", "(Z)V", "ackSendToDUT", "J", "q", "totalDataParsed", "", "K", "Ljava/util/List;", "m", "()Ljava/util/List;", "D", "(Ljava/util/List;)V", "keyArray", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "L", "Ljava/util/LinkedHashMap;", "n", "()Ljava/util/LinkedHashMap;", "(Ljava/util/LinkedHashMap;)V", "keyValues", "M", "Ljava/lang/String;", "d", "u", "(Ljava/lang/String;)V", "battery_1_sn", "N", "g", "x", "battery_2_sn", "O", "j", androidx.exifinterface.media.a.Y4, "battery_3_sn", "P", "c", "t", "battery_1_pack_model", "Q", "f", "w", "battery_2_pack_model", "R", "i", "z", "battery_3_pack_model", androidx.exifinterface.media.a.T4, com.harman.log.b.f47574c, "s", "battery_1_cell_connection", androidx.exifinterface.media.a.f5, "e", "v", "battery_2_cell_connection", "U", "h", "y", "battery_3_cell_connection", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeviceAnalytics implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private int f37795E;

    /* renamed from: F, reason: collision with root package name */
    private int f37796F;

    /* renamed from: I, reason: collision with root package name */
    private boolean f37799I;

    /* renamed from: J, reason: collision with root package name */
    private int f37800J;

    /* renamed from: K, reason: collision with root package name */
    @d
    private List<String> f37801K;

    /* renamed from: G, reason: collision with root package name */
    @d
    private HashMap<Integer, String> f37797G = new HashMap<>();

    /* renamed from: H, reason: collision with root package name */
    @d
    private HashMap<Integer, Integer> f37798H = new HashMap<>();

    /* renamed from: L, reason: collision with root package name */
    @d
    private LinkedHashMap<String, Integer> f37802L = new LinkedHashMap<>();

    /* renamed from: M, reason: collision with root package name */
    @d
    private String f37803M = "";

    /* renamed from: N, reason: collision with root package name */
    @d
    private String f37804N = "";

    /* renamed from: O, reason: collision with root package name */
    @d
    private String f37805O = "";

    /* renamed from: P, reason: collision with root package name */
    @d
    private String f37806P = "";

    /* renamed from: Q, reason: collision with root package name */
    @d
    private String f37807Q = "";

    /* renamed from: R, reason: collision with root package name */
    @d
    private String f37808R = "";

    /* renamed from: S, reason: collision with root package name */
    @d
    private String f37809S = "";

    /* renamed from: T, reason: collision with root package name */
    @d
    private String f37810T = "";

    /* renamed from: U, reason: collision with root package name */
    @d
    private String f37811U = "";

    public DeviceAnalytics() {
        List<String> R4;
        R4 = A.R4("twsOn,twsParty,twsStereo,twsPlaybackParty,twsPlaybackStereo,twsPartyPrimay,twsPartySecondary,nsEnter,nsWakeupApp,nsWakeupPowerKey,nsWakeupBTPlay,bsWakeupApp,bsWakeupPowerKey,powerOnPowerKey,eqOff,eqBassBoost1,eqBassBoost2,userEQDefaultLevel,userEQAnyLevel,userEQSignatureLevel,userEQMoviesLevel,userEQChillLevel,userEQVocalLevel,userEQCustomLevel,playbackBattery,playbackAC,srcBatteryBT,srcBatteryUSB,srcBatteryAUX,srcBatteryDaisyChain,srcAcBT,srcAcUSB,srcAcAUX,srcAcDaisyChain,multiPhonePlayback,srcBatteryUAC,srcAcUAC,batteryChargingTime,batteryFastCharging,batteryPreCharging,phoneChargingTime,batteryAutoPowerOff1,batteryAutoPowerOff2,ampProtectionReset,carCharging,keyPowerOn,powerOnDuration,keyPlayPause,keyTws,keyLight,keyBassBoost,keySource,keyDjEffect1,keyDjEffect2,keyDjEffect3,keyBassUp,keyBassDown,keyTrebleUp,keyTrebleDown,keyEchoUp,keyEchoDown,keyVolumeUp,keyVolumeDown,keyBTShort,keyBTLong,keyLightLong,knobsVolume,knobsLight,knobsBass,knobsTreble,knobsEcho,knobsMic1Vol,knobsMic2Vol,knobsGuitarVol,volPhoneInput,volPopularLevel,volPopularDuration,vol0Duration,vol1Duration,vol2Duration,vol3Duration,vol4Duration,vol5Duration,vol6Duration,vol7Duration,vol8Duration,vol9Duration,vol10Duration,vol11Duration,vol12Duration,vol13Duration,vol14Duration,vol15Duration,vol16Duration,vol17Duration,vol18Duration,vol19Duration,vol20Duration,vol21Duration,vol22Duration,vol23Duration,vol24Duration,vol25Duration,vol26Duration,vol27Duration,vol28Duration,vol29Duration,vol30Duration,vol31Duration,vol32Duration,lightRock,lightNeon,lightClub,lightFlow,lightRipple,lightCross,lightFlash,lightCustom,lightFigure8,lightStrobe,lightStrobeUp,lightStrobeDown,lightSide2Ring,lightSideStripe,lightStar,lightLoop,lightBounce,lightTrim,lightSwitch,lightFreeze,lightEdgeLed,lightFigure8off,lightStrobeoff,lightStaroff,lightEdgeLedoff,lightStripeLedoffmic1,mic2,guitar,mic1Duration,mic2Duration,guitarDuration,popularMic1,popularMic2,popularGuitar,popularBass,popularTreble,popularEcho,pid1, pid1Times,pid2, pid2Times,pid3, pid3Times,pid4, pid4Times,pid5, pid5Times,pid6, pid6Times,pid7, pid7Times,pid8, pid8Times,pid9, pid9Times,pid10, pid10Times,auracastButton,auracastParty, ,auracastPlaybackParty, ,auracastTransmitterTimes,auracastTransmitterDuration,auracastReceiverTimes,auracastReceiverDuration,effectLabFilter,effectLabGitar,effectLabRepeater,effectLabWipeout,effectLabEcho,DJToneHorn,DJToneBoo,DJToneLike,DJToneUnLike,DJToneScratch1,DJToneScratch2,DJToneScratch3,DJToneClapping,DJToneLetsGo,DJToneHandsup,DJToneHeyHey,DJToneLetsParty,DJToneJump,DJTone123LetsGo,DJToneReady,uacRecordTimes,uacRecordDuration,batteryPackModel,batteryCellConnection,batterySn,batteryPackModel2,batteryCellConnection2,batterySn2,batteryPackModel3,batteryCellConnection3,batterySn3", new String[]{","}, false, 0, 6, null);
        this.f37801K = R4;
        Iterator<String> it = R4.iterator();
        while (it.hasNext()) {
            this.f37802L.put(it.next(), 0);
        }
    }

    public final void A(@d String str) {
        F.p(str, "<set-?>");
        this.f37805O = str;
    }

    public final void B(int i4) {
        this.f37795E = i4;
    }

    public final void C(@d HashMap<Integer, Integer> hashMap) {
        F.p(hashMap, "<set-?>");
        this.f37798H = hashMap;
    }

    public final void D(@d List<String> list) {
        F.p(list, "<set-?>");
        this.f37801K = list;
    }

    public final void E(@d LinkedHashMap<String, Integer> linkedHashMap) {
        F.p(linkedHashMap, "<set-?>");
        this.f37802L = linkedHashMap;
    }

    public final void F(int i4) {
        this.f37796F = i4;
    }

    public final void G(@d HashMap<Integer, String> hashMap) {
        F.p(hashMap, "<set-?>");
        this.f37797G = hashMap;
    }

    public final void H(int i4) {
        this.f37800J = i4;
    }

    @d
    public final String I() {
        String i22;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"DeviceAnalytics\":{");
        for (Map.Entry<String, Integer> entry : this.f37802L.entrySet()) {
            String key = entry.getKey();
            stringBuffer.append("\n\"" + ((Object) key) + "\" : " + entry.getValue() + ",");
        }
        stringBuffer.append("}");
        String stringBuffer2 = stringBuffer.toString();
        F.o(stringBuffer2, "toString(...)");
        i22 = z.i2(stringBuffer2, ",}", "}", false, 4, null);
        return i22;
    }

    public final boolean a() {
        return this.f37799I;
    }

    @d
    public final String b() {
        return this.f37809S;
    }

    @d
    public final String c() {
        return this.f37806P;
    }

    @d
    public final String d() {
        return this.f37803M;
    }

    @d
    public final String e() {
        return this.f37810T;
    }

    @d
    public final String f() {
        return this.f37807Q;
    }

    @d
    public final String g() {
        return this.f37804N;
    }

    @d
    public final String h() {
        return this.f37811U;
    }

    @d
    public final String i() {
        return this.f37808R;
    }

    @d
    public final String j() {
        return this.f37805O;
    }

    public final int k() {
        return this.f37795E;
    }

    @d
    public final HashMap<Integer, Integer> l() {
        return this.f37798H;
    }

    @d
    public final List<String> m() {
        return this.f37801K;
    }

    @d
    public final LinkedHashMap<String, Integer> n() {
        return this.f37802L;
    }

    public final int o() {
        return this.f37796F;
    }

    @d
    public final HashMap<Integer, String> p() {
        return this.f37797G;
    }

    public final int q() {
        return this.f37800J;
    }

    public final void r(boolean z3) {
        this.f37799I = z3;
    }

    public final void s(@d String str) {
        F.p(str, "<set-?>");
        this.f37809S = str;
    }

    public final void t(@d String str) {
        F.p(str, "<set-?>");
        this.f37806P = str;
    }

    public final void u(@d String str) {
        F.p(str, "<set-?>");
        this.f37803M = str;
    }

    public final void v(@d String str) {
        F.p(str, "<set-?>");
        this.f37810T = str;
    }

    public final void w(@d String str) {
        F.p(str, "<set-?>");
        this.f37807Q = str;
    }

    public final void x(@d String str) {
        F.p(str, "<set-?>");
        this.f37804N = str;
    }

    public final void y(@d String str) {
        F.p(str, "<set-?>");
        this.f37811U = str;
    }

    public final void z(@d String str) {
        F.p(str, "<set-?>");
        this.f37808R = str;
    }
}
