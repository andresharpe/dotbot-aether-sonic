package com.harman.sdk.device;

import android.util.Log;
import com.google.gson.annotations.SerializedName;
import com.harman.analytics.deviceAws.DeviceAnalytics;
import com.harman.analytics.deviceAws.PlayAnalytics;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.KaraokeMicEQInfo;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.UsbStatus;
import com.harman.sdk.utils.k;
import java.util.HashMap;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 Y2\u00020\u0001:\u0002ä\u0001B\t¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010\t\"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b\u001f\u0010\t\"\u0004\b%\u0010\"R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\"R\"\u0010J\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010 \u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\"R\"\u0010P\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010\u000b\"\u0004\bN\u0010OR\"\u0010S\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010L\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010OR\"\u0010W\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010L\u001a\u0004\bU\u0010\u000b\"\u0004\bV\u0010OR\"\u0010Z\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010L\u001a\u0004\bX\u0010\u000b\"\u0004\bY\u0010OR\"\u0010]\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010L\u001a\u0004\b[\u0010\u000b\"\u0004\b\\\u0010OR\"\u0010`\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010 \u001a\u0004\b(\u0010\t\"\u0004\b_\u0010\"R\"\u0010c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010 \u001a\u0004\b/\u0010\t\"\u0004\bb\u0010\"R\"\u0010e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b4\u0010\t\"\u0004\bd\u0010\"R$\u0010l\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\ba\u0010i\"\u0004\bj\u0010kR\"\u0010o\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010\u0019\u001a\u0004\bg\u0010\u001b\"\u0004\bn\u0010\u001dR\"\u0010s\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010L\u001a\u0004\bq\u0010\u000b\"\u0004\br\u0010OR\"\u0010v\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\bt\u0010\u001b\"\u0004\bu\u0010\u001dR\"\u0010x\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\bG\u0010\u001b\"\u0004\bw\u0010\u001dR\"\u0010{\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010L\u001a\u0004\by\u0010\u000b\"\u0004\bz\u0010OR\"\u0010}\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010 \u001a\u0004\b^\u0010\t\"\u0004\b|\u0010\"R'\u0010\u0084\u0001\u001a\u00020~8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b$\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0088\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010L\u001a\u0005\b\u0086\u0001\u0010\u000b\"\u0005\b\u0087\u0001\u0010OR8\u0010\u008d\u0001\u001a \u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u0089\u0001j\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002`\u008a\u00018\u0006¢\u0006\u000e\n\u0005\b6\u0010\u008b\u0001\u001a\u0005\bp\u0010\u008c\u0001R%\u0010\u0090\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bD\u0010L\u001a\u0005\b\u008e\u0001\u0010\u000b\"\u0005\b\u008f\u0001\u0010OR&\u0010\u0094\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010L\u001a\u0005\b\u0092\u0001\u0010\u000b\"\u0005\b\u0093\u0001\u0010OR&\u0010\u0098\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010L\u001a\u0005\b\u0096\u0001\u0010\u000b\"\u0005\b\u0097\u0001\u0010OR%\u0010\u009b\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\f\u0010L\u001a\u0005\b\u0099\u0001\u0010\u000b\"\u0005\b\u009a\u0001\u0010OR%\u0010\u009e\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b[\u0010L\u001a\u0005\b\u009c\u0001\u0010\u000b\"\u0005\b\u009d\u0001\u0010OR%\u0010¡\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bX\u0010L\u001a\u0005\b\u009f\u0001\u0010\u000b\"\u0005\b \u0001\u0010OR&\u0010¤\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010L\u001a\u0005\b¢\u0001\u0010\u000b\"\u0005\b£\u0001\u0010OR%\u0010§\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\by\u0010L\u001a\u0005\b¥\u0001\u0010\u000b\"\u0005\b¦\u0001\u0010OR%\u0010©\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bU\u0010L\u001a\u0005\b\u0091\u0001\u0010\u000b\"\u0005\b¨\u0001\u0010OR&\u0010\u00ad\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010L\u001a\u0005\b«\u0001\u0010\u000b\"\u0005\b¬\u0001\u0010OR$\u0010¯\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\bq\u0010L\u001a\u0004\bK\u0010\u000b\"\u0005\b®\u0001\u0010OR%\u0010²\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u000e\u0010L\u001a\u0005\b°\u0001\u0010\u000b\"\u0005\b±\u0001\u0010OR$\u0010´\u0001\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\bQ\u0010 \u001a\u0004\b\u007f\u0010\t\"\u0005\b³\u0001\u0010\"R&\u0010·\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010L\u001a\u0005\bµ\u0001\u0010\u000b\"\u0005\b¶\u0001\u0010OR&\u0010¹\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010L\u001a\u0005\bª\u0001\u0010\u000b\"\u0005\b¸\u0001\u0010OR&\u0010¼\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010L\u001a\u0005\bº\u0001\u0010\u000b\"\u0005\b»\u0001\u0010OR&\u0010¿\u0001\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010 \u001a\u0005\b½\u0001\u0010\t\"\u0005\b¾\u0001\u0010\"R&\u0010Á\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bµ\u0001\u0010L\u001a\u0005\b\u0085\u0001\u0010\u000b\"\u0005\bÀ\u0001\u0010OR%\u0010Ã\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b«\u0001\u0010 \u001a\u0004\bT\u0010\t\"\u0005\bÂ\u0001\u0010\"R,\u0010É\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010Å\u0001\u001a\u0006\b\u0095\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R+\u0010Ï\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b°\u0001\u0010Ë\u0001\u001a\u0005\b<\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R&\u0010Ò\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010\u0019\u001a\u0005\bÐ\u0001\u0010\u001b\"\u0005\bÑ\u0001\u0010\u001dR%\u0010Ô\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u008e\u0001\u0010L\u001a\u0004\bC\u0010\u000b\"\u0005\bÓ\u0001\u0010OR+\u0010Ú\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010Ö\u0001\u001a\u0005\b\u0011\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R+\u0010à\u0001\u001a\u0005\u0018\u00010Û\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b»\u0001\u0010Ü\u0001\u001a\u0005\bm\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u0015\u0010á\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010L¨\u0006å\u0001"}, d2 = {"Lcom/harman/sdk/device/PartyBoxDevice;", "Lcom/harman/sdk/device/HmDevice;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "N0", "()Z", "w1", "connectedDevice", "E1", "(Lcom/harman/sdk/device/HmDevice;)Z", "", "R0", "J", "o1", "()J", "serialVersionUID", "", "value", "S0", "Ljava/lang/String;", "m1", "()Ljava/lang/String;", "v2", "(Ljava/lang/String;)V", "secondaryMAC", "T0", "I", "X1", "(I)V", "deviceBattery", "U0", "Y1", "deviceCharging", "Lcom/harman/sdk/utils/PartyConnectStatus;", "V0", "Lcom/harman/sdk/utils/PartyConnectStatus;", "i1", "()Lcom/harman/sdk/utils/PartyConnectStatus;", "s2", "(Lcom/harman/sdk/utils/PartyConnectStatus;)V", "partyConnectMode", "W0", "n1", "w2", "serialNumber", "Lcom/harman/sdk/utils/UsbStatus;", "X0", "Lcom/harman/sdk/utils/UsbStatus;", "s1", "()Lcom/harman/sdk/utils/UsbStatus;", "M2", "(Lcom/harman/sdk/utils/UsbStatus;)V", "usbInsertedStatus", "Lcom/harman/sdk/utils/MusicControlSettings;", "Y0", "Lcom/harman/sdk/utils/MusicControlSettings;", "e1", "()Lcom/harman/sdk/utils/MusicControlSettings;", "o2", "(Lcom/harman/sdk/utils/MusicControlSettings;)V", "musicControlSettings", "Z0", "t1", "N2", "volume", k.f48625V, "f1", "p2", "mute", "b1", "Z", k.f48619T, "m2", "(Z)V", "mainSpeaker", "F1", "y2", "isStandbyMode", "d1", "B1", "f2", "isEverConnected", "y1", "T1", "isBTConnected", "x1", "S1", "isBLENotConnected", "g1", "c2", "djEffectButton1ToneId", "h1", "d2", "djEffectButton2ToneId", "e2", "djEffectButton3ToneId", "Lcom/harman/sdk/message/PartyBoxLightShowSettings;", "j1", "Lcom/harman/sdk/message/PartyBoxLightShowSettings;", "()Lcom/harman/sdk/message/PartyBoxLightShowSettings;", "r2", "(Lcom/harman/sdk/message/PartyBoxLightShowSettings;)V", "partyBoxLightShowSettings", "k1", "t2", "phoneMacAddress", "l1", "D1", "h2", "isFirmwareUpdateAvailable", "p1", "x2", "serverFirmwareVersion", "k2", "localOTAFilePath", "A1", k.f48628W, "isDeviceUpgradeCancel", "q2", "otaDFUBreakPointDataBytes", "", "q1", "[I", "()[I", "b2", "([I)V", "dfuVersionInts", "r1", "z1", "Z1", "isDeviceUpgrade", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "secondaryDeviceInfo", "P1", "I2", "isSupportUserEq", "u1", "O1", "H2", "isSupportTwsVolume", "v1", "I1", "B2", "isSupportDeviceAnalytics", "J1", "C2", "isSupportFeedbackTone", "M1", "F2", "isSupportPartyLightStage", "H1", "A2", "isSupportCrossTWS", "G1", "z2", "isSupportAuracastSQ", "Q1", "J2", "isSupportVolumeBoost", "O2", "volumeBoostStatus", "C1", "L1", "E2", "isSupportLockTopPanel", "l2", "lockTopPanelStatus", "N1", "G2", "isSupportToneShifter", "K2", "toneShifterStatus", "K1", "D2", "isSupportLeAudio", "g2", "isFeatureInfoReceived", "O0", "R1", "auracastSQEnable", "P0", "U1", "bassBoostXlSound", "L2", "twsConnectedToDiffModel", "n2", "micConnectStatus", "Lcom/harman/sdk/message/WirelessMicInfo;", "Lcom/harman/sdk/message/WirelessMicInfo;", "()Lcom/harman/sdk/message/WirelessMicInfo;", "P2", "(Lcom/harman/sdk/message/WirelessMicInfo;)V", "wirelessMicInfo", "Lcom/harman/sdk/message/KaraokeMicEQInfo;", "Lcom/harman/sdk/message/KaraokeMicEQInfo;", "()Lcom/harman/sdk/message/KaraokeMicEQInfo;", "i2", "(Lcom/harman/sdk/message/KaraokeMicEQInfo;)V", "karaokeMicEQInfo", "Q0", "V1", "checkSum", "j2", "leAudioStatus", "Lcom/harman/analytics/deviceAws/DeviceAnalytics;", "Lcom/harman/analytics/deviceAws/DeviceAnalytics;", "()Lcom/harman/analytics/deviceAws/DeviceAnalytics;", "W1", "(Lcom/harman/analytics/deviceAws/DeviceAnalytics;)V", "deviceAnalytics", "Lcom/harman/analytics/deviceAws/PlayAnalytics;", "Lcom/harman/analytics/deviceAws/PlayAnalytics;", "()Lcom/harman/analytics/deviceAws/PlayAnalytics;", "u2", "(Lcom/harman/analytics/deviceAws/PlayAnalytics;)V", "playAnalytics", "ringLightCommandSupportForPB310", "<init>", "()V", "a", "2_utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyBoxDevice extends HmDevice {

    /* renamed from: T1, reason: collision with root package name */
    @d
    private static final a f47811T1 = new a(null);

    /* renamed from: A1, reason: collision with root package name */
    @SerializedName("supportVolumeBoost")
    private boolean f47812A1;

    /* renamed from: B1, reason: collision with root package name */
    @SerializedName("volumeBoostStatus")
    private boolean f47813B1;

    /* renamed from: C1, reason: collision with root package name */
    @SerializedName("supportLockTopPanel")
    private boolean f47814C1;

    /* renamed from: D1, reason: collision with root package name */
    @SerializedName("lockTopPanelStatus")
    private boolean f47815D1;

    /* renamed from: E1, reason: collision with root package name */
    @SerializedName("supportToneShifter")
    private boolean f47816E1;

    /* renamed from: F1, reason: collision with root package name */
    @SerializedName("toneShifterStatus")
    private int f47817F1;

    /* renamed from: G1, reason: collision with root package name */
    @SerializedName("supportLeAudio")
    private boolean f47818G1;

    /* renamed from: H1, reason: collision with root package name */
    @SerializedName("featureInfoReceived")
    private boolean f47819H1;

    /* renamed from: I1, reason: collision with root package name */
    private boolean f47820I1;

    /* renamed from: M1, reason: collision with root package name */
    @SerializedName("wirelessMicInfo")
    @e
    private WirelessMicInfo f47824M1;

    /* renamed from: N1, reason: collision with root package name */
    @SerializedName("karaokeMicEQInfo")
    @e
    private KaraokeMicEQInfo f47825N1;

    /* renamed from: P1, reason: collision with root package name */
    @SerializedName("leAudio")
    private boolean f47827P1;

    /* renamed from: Q1, reason: collision with root package name */
    @e
    private DeviceAnalytics f47828Q1;

    /* renamed from: R1, reason: collision with root package name */
    @e
    private PlayAnalytics f47830R1;

    /* renamed from: S1, reason: collision with root package name */
    private final boolean f47832S1;

    /* renamed from: T0, reason: collision with root package name */
    private int f47833T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f47834U0;

    /* renamed from: Y0, reason: collision with root package name */
    @e
    private MusicControlSettings f47838Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private int f47839Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f47840a1;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f47841b1;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f47842c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f47843d1;

    /* renamed from: e1, reason: collision with root package name */
    private boolean f47844e1;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f47845f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f47846g1;

    /* renamed from: h1, reason: collision with root package name */
    private int f47847h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f47848i1;

    /* renamed from: j1, reason: collision with root package name */
    @e
    private PartyBoxLightShowSettings f47849j1;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f47851l1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f47854o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f47855p1;

    /* renamed from: r1, reason: collision with root package name */
    private boolean f47857r1;

    /* renamed from: t1, reason: collision with root package name */
    @SerializedName("supportUserEq")
    private boolean f47859t1;

    /* renamed from: u1, reason: collision with root package name */
    @SerializedName("supportTwsVolueme")
    private boolean f47860u1;

    /* renamed from: v1, reason: collision with root package name */
    @SerializedName("supportDeviceAnalytics")
    private boolean f47861v1;

    /* renamed from: w1, reason: collision with root package name */
    @SerializedName("supportDeviceAnalytics")
    private boolean f47862w1;

    /* renamed from: x1, reason: collision with root package name */
    @SerializedName("supportPartyLightStage")
    private boolean f47863x1;

    /* renamed from: y1, reason: collision with root package name */
    @SerializedName("supportPartyLightStage")
    private boolean f47864y1;

    /* renamed from: z1, reason: collision with root package name */
    @SerializedName("supportAuracastSQ")
    private boolean f47865z1;

    /* renamed from: R0, reason: collision with root package name */
    private final long f47829R0 = -6902284990973924514L;

    /* renamed from: S0, reason: collision with root package name */
    @d
    private String f47831S0 = "";

    /* renamed from: V0, reason: collision with root package name */
    @d
    private PartyConnectStatus f47835V0 = PartyConnectStatus.UNKNOWN;

    /* renamed from: W0, reason: collision with root package name */
    @d
    private String f47836W0 = "";

    /* renamed from: X0, reason: collision with root package name */
    @d
    private UsbStatus f47837X0 = UsbStatus.UNKNOWN;

    /* renamed from: k1, reason: collision with root package name */
    @d
    private String f47850k1 = "";

    /* renamed from: m1, reason: collision with root package name */
    @d
    private String f47852m1 = "";

    /* renamed from: n1, reason: collision with root package name */
    @d
    private String f47853n1 = "";

    /* renamed from: q1, reason: collision with root package name */
    @d
    private int[] f47856q1 = new int[0];

    /* renamed from: s1, reason: collision with root package name */
    @d
    private final HashMap<String, Object> f47858s1 = new HashMap<>();

    /* renamed from: J1, reason: collision with root package name */
    @SerializedName("bassBoostXlSound")
    private int f47821J1 = -1;

    /* renamed from: K1, reason: collision with root package name */
    private boolean f47822K1 = true;

    /* renamed from: L1, reason: collision with root package name */
    private int f47823L1 = -1;

    /* renamed from: O1, reason: collision with root package name */
    @d
    private String f47826O1 = "";

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public final boolean A1() {
        return this.f47854o1;
    }

    public final void A2(boolean z3) {
        this.f47864y1 = z3;
    }

    public final boolean B1() {
        return this.f47843d1;
    }

    public final void B2(boolean z3) {
        this.f47861v1 = z3;
    }

    public final boolean C1() {
        return this.f47819H1;
    }

    public final void C2(boolean z3) {
        this.f47862w1 = z3;
    }

    public final boolean D1() {
        return this.f47851l1;
    }

    public final void D2(boolean z3) {
        this.f47818G1 = z3;
    }

    public final boolean E1(@e HmDevice hmDevice) {
        String str;
        String str2 = null;
        if (hmDevice != null) {
            str = hmDevice.q();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            if (hmDevice != null) {
                str2 = hmDevice.q();
            }
            F.m(str2);
            if (!com.harman.sdk.utils.d.L(str2)) {
                return true;
            }
            return this.f47832S1;
        }
        return this.f47832S1;
    }

    public final void E2(boolean z3) {
        this.f47814C1 = z3;
    }

    public final boolean F1() {
        return this.f47842c1;
    }

    public final void F2(boolean z3) {
        this.f47863x1 = z3;
    }

    public final boolean G1() {
        return this.f47865z1;
    }

    public final void G2(boolean z3) {
        this.f47816E1 = z3;
    }

    public final boolean H1() {
        return this.f47864y1;
    }

    public final void H2(boolean z3) {
        this.f47860u1 = z3;
    }

    public final boolean I1() {
        return this.f47861v1;
    }

    public final void I2(boolean z3) {
        this.f47859t1 = z3;
    }

    public final boolean J1() {
        return this.f47862w1;
    }

    public final void J2(boolean z3) {
        this.f47812A1 = z3;
    }

    public final boolean K1() {
        return this.f47818G1;
    }

    public final void K2(int i4) {
        this.f47817F1 = i4;
    }

    public final boolean L1() {
        return this.f47814C1;
    }

    public final void L2(boolean z3) {
        this.f47822K1 = z3;
    }

    public final boolean M1() {
        return this.f47863x1;
    }

    public final void M2(@d UsbStatus usbStatus) {
        F.p(usbStatus, "<set-?>");
        this.f47837X0 = usbStatus;
    }

    public final boolean N0() {
        PartyConnectStatus partyConnectStatus = this.f47835V0;
        if (partyConnectStatus != PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED && partyConnectStatus != PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING) {
            return false;
        }
        return true;
    }

    public final boolean N1() {
        return this.f47816E1;
    }

    public final void N2(int i4) {
        this.f47839Z0 = i4;
    }

    public final boolean O0() {
        return this.f47820I1;
    }

    public final boolean O1() {
        return this.f47860u1;
    }

    public final void O2(boolean z3) {
        this.f47813B1 = z3;
    }

    public final int P0() {
        return this.f47821J1;
    }

    public final boolean P1() {
        return this.f47859t1;
    }

    public final void P2(@e WirelessMicInfo wirelessMicInfo) {
        this.f47824M1 = wirelessMicInfo;
    }

    @d
    public final String Q0() {
        return this.f47826O1;
    }

    public final boolean Q1() {
        return this.f47812A1;
    }

    @e
    public final DeviceAnalytics R0() {
        return this.f47828Q1;
    }

    public final void R1(boolean z3) {
        this.f47820I1 = z3;
    }

    public final int S0() {
        return this.f47833T0;
    }

    public final void S1(boolean z3) {
        this.f47845f1 = z3;
    }

    public final int T0() {
        return this.f47834U0;
    }

    public final void T1(boolean z3) {
        this.f47844e1 = z3;
    }

    @d
    public final int[] U0() {
        return this.f47856q1;
    }

    public final void U1(int i4) {
        this.f47821J1 = i4;
    }

    public final int V0() {
        return this.f47846g1;
    }

    public final void V1(@d String str) {
        F.p(str, "<set-?>");
        this.f47826O1 = str;
    }

    public final int W0() {
        return this.f47847h1;
    }

    public final void W1(@e DeviceAnalytics deviceAnalytics) {
        this.f47828Q1 = deviceAnalytics;
    }

    public final int X0() {
        return this.f47848i1;
    }

    public final void X1(int i4) {
        this.f47833T0 = i4;
    }

    @e
    public final KaraokeMicEQInfo Y0() {
        return this.f47825N1;
    }

    public final void Y1(int i4) {
        this.f47834U0 = i4;
    }

    public final boolean Z0() {
        return this.f47827P1;
    }

    public final void Z1(boolean z3) {
        this.f47857r1 = z3;
    }

    @d
    public final String a1() {
        return this.f47853n1;
    }

    public final void a2(boolean z3) {
        this.f47854o1 = z3;
    }

    public final boolean b1() {
        return this.f47815D1;
    }

    public final void b2(@d int[] iArr) {
        F.p(iArr, "<set-?>");
        this.f47856q1 = iArr;
    }

    public final boolean c1() {
        return this.f47841b1;
    }

    public final void c2(int i4) {
        this.f47846g1 = i4;
    }

    public final int d1() {
        return this.f47823L1;
    }

    public final void d2(int i4) {
        this.f47847h1 = i4;
    }

    @e
    public final MusicControlSettings e1() {
        return this.f47838Y0;
    }

    public final void e2(int i4) {
        this.f47848i1 = i4;
    }

    @Override // com.harman.sdk.device.HmDevice
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
        if (!F.g(PartyBoxDevice.class, cls) || !super.equals(obj)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        if (F.g(n(), ((PartyBoxDevice) obj).n())) {
            return true;
        }
        return false;
    }

    public final int f1() {
        return this.f47840a1;
    }

    public final void f2(boolean z3) {
        this.f47843d1 = z3;
    }

    public final int g1() {
        return this.f47855p1;
    }

    public final void g2(boolean z3) {
        this.f47819H1 = z3;
    }

    @e
    public final PartyBoxLightShowSettings h1() {
        return this.f47849j1;
    }

    public final void h2(boolean z3) {
        this.f47851l1 = z3;
    }

    @Override // com.harman.sdk.device.HmDevice
    public int hashCode() {
        return (super.hashCode() * 31) + n().hashCode();
    }

    @d
    public final PartyConnectStatus i1() {
        return this.f47835V0;
    }

    public final void i2(@e KaraokeMicEQInfo karaokeMicEQInfo) {
        this.f47825N1 = karaokeMicEQInfo;
    }

    @d
    public final String j1() {
        return this.f47850k1;
    }

    public final void j2(boolean z3) {
        this.f47827P1 = z3;
    }

    @e
    public final PlayAnalytics k1() {
        return this.f47830R1;
    }

    public final void k2(@d String str) {
        F.p(str, "<set-?>");
        this.f47853n1 = str;
    }

    @d
    public final HashMap<String, Object> l1() {
        return this.f47858s1;
    }

    public final void l2(boolean z3) {
        this.f47815D1 = z3;
    }

    @d
    public final String m1() {
        return this.f47831S0;
    }

    public final void m2(boolean z3) {
        this.f47841b1 = z3;
    }

    @d
    public final String n1() {
        return this.f47836W0;
    }

    public final void n2(int i4) {
        this.f47823L1 = i4;
    }

    public final long o1() {
        return this.f47829R0;
    }

    public final void o2(@e MusicControlSettings musicControlSettings) {
        this.f47838Y0 = musicControlSettings;
    }

    @d
    public final String p1() {
        return this.f47852m1;
    }

    public final void p2(int i4) {
        this.f47840a1 = i4;
    }

    public final int q1() {
        return this.f47817F1;
    }

    public final void q2(int i4) {
        this.f47855p1 = i4;
    }

    public final boolean r1() {
        return this.f47822K1;
    }

    public final void r2(@e PartyBoxLightShowSettings partyBoxLightShowSettings) {
        this.f47849j1 = partyBoxLightShowSettings;
    }

    @d
    public final UsbStatus s1() {
        return this.f47837X0;
    }

    public final void s2(@d PartyConnectStatus partyConnectStatus) {
        F.p(partyConnectStatus, "<set-?>");
        this.f47835V0 = partyConnectStatus;
    }

    public final int t1() {
        return this.f47839Z0;
    }

    public final void t2(@d String str) {
        F.p(str, "<set-?>");
        this.f47850k1 = str;
    }

    public final boolean u1() {
        return this.f47813B1;
    }

    public final void u2(@e PlayAnalytics playAnalytics) {
        this.f47830R1 = playAnalytics;
    }

    @e
    public final WirelessMicInfo v1() {
        return this.f47824M1;
    }

    public final void v2(@d String value) {
        F.p(value, "value");
        Log.d("xiaoming", "set secondaryMAC = " + value);
        this.f47831S0 = value;
    }

    public final boolean w1() {
        BatteryInfo f4 = f();
        if (f4 != null) {
            return f4.a();
        }
        return false;
    }

    public final void w2(@d String str) {
        F.p(str, "<set-?>");
        this.f47836W0 = str;
    }

    public final boolean x1() {
        return this.f47845f1;
    }

    public final void x2(@d String str) {
        F.p(str, "<set-?>");
        this.f47852m1 = str;
    }

    public final boolean y1() {
        return this.f47844e1;
    }

    public final void y2(boolean z3) {
        this.f47842c1 = z3;
    }

    public final boolean z1() {
        return this.f47857r1;
    }

    public final void z2(boolean z3) {
        this.f47865z1 = z3;
    }
}
