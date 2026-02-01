package com.harman.sdk.device;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0909k;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.message.AdvancedEQSettings;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.OneTouchMusicButtonSettings;
import com.harman.sdk.message.SimpleEQSettings;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.ota.RemoteOTAConfig;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.EnumSyncOnOff;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u0005\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 «\u00012\u00020\u0001:\u0001\u0010B\t¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\"R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\"R$\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001f\u001a\u0004\b\u0005\u0010\u0019\"\u0004\b)\u0010\"R\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\"R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\"R\"\u00106\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\"R\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\"R\"\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001f\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\"R$\u0010E\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\b/\u0010I\"\u0004\bJ\u0010KR\"\u0010S\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010V\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001f\u001a\u0004\bT\u0010\u0019\"\u0004\bU\u0010\"R\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b\u001e\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010j\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010+\u001a\u0004\bg\u0010\u0017\"\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010s\u001a\u00020k8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010m\u001a\u0004\bM\u0010p\"\u0004\bq\u0010rR\"\u0010u\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010N\u001a\u0004\bG\u0010P\"\u0004\bo\u0010RR\"\u0010|\u001a\u00020v8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010/\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020v8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b}\u0010/\u001a\u0004\b~\u0010y\"\u0004\b\u007f\u0010{R&\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\bN\u0010\u001f\u001a\u0004\b$\u0010\u0019\"\u0005\b\u0081\u0001\u0010\"R&\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\bC\u0010\u001f\u001a\u0004\b+\u0010\u0019\"\u0005\b\u0083\u0001\u0010\"R%\u0010\u0087\u0001\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b9\u0010+\u001a\u0005\b\u0085\u0001\u0010\u0017\"\u0005\b\u0086\u0001\u0010iR%\u0010\u008a\u0001\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bq\u0010+\u001a\u0005\b\u0088\u0001\u0010\u0017\"\u0005\b\u0089\u0001\u0010iR%\u0010\u008c\u0001\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u0086\u0001\u0010+\u001a\u0005\b\u008b\u0001\u0010\u0017\"\u0004\bw\u0010iR\u0015\u0010\u008d\u0001\u001a\u00020\u00158\u0002X\u0083D¢\u0006\u0006\n\u0004\bc\u0010+R\u0015\u0010\u008e\u0001\u001a\u00020\u00158\u0002X\u0083D¢\u0006\u0006\n\u0004\bQ\u0010+R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u0098\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bU\u0010\u0091\u0001\u001a\u0006\b\u0091\u0001\u0010\u0093\u0001\"\u0006\b\u0097\u0001\u0010\u0095\u0001R*\u0010\u009c\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0091\u0001\u001a\u0006\b\u009a\u0001\u0010\u0093\u0001\"\u0006\b\u009b\u0001\u0010\u0095\u0001R%\u0010\u009e\u0001\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u0089\u0001\u0010+\u001a\u0005\b\u009d\u0001\u0010\u0017\"\u0004\bN\u0010iR)\u0010¡\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b5\u0010\u0091\u0001\u001a\u0006\b\u009f\u0001\u0010\u0093\u0001\"\u0006\b \u0001\u0010\u0095\u0001R)\u0010¤\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b)\u0010\u0091\u0001\u001a\u0006\b¢\u0001\u0010\u0093\u0001\"\u0006\b£\u0001\u0010\u0095\u0001R*\u0010ª\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b=\u0010¦\u0001\u001a\u0005\b(\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R$\u0010¬\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b!\u0010N\u001a\u0004\b_\u0010P\"\u0005\b«\u0001\u0010RR-\u0010\u00ad\u0001\u001a\u00020\u00022\u0007\u0010\u00ad\u0001\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0013\n\u0004\b&\u0010\u001f\u001a\u0004\b\u001b\u0010\u0019\"\u0005\b®\u0001\u0010\"R$\u0010°\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b1\u0010N\u001a\u0004\bf\u0010P\"\u0005\b¯\u0001\u0010RR%\u0010²\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b \u0001\u0010N\u001a\u0004\bl\u0010P\"\u0005\b±\u0001\u0010RR%\u0010´\u0001\u001a\u00020v8F@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0007\u0010/\u001a\u0005\b³\u0001\u0010y\"\u0005\b\u0099\u0001\u0010{R2\u0010»\u0001\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010·\u0001\u001a\u0005\b3\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R1\u0010¾\u0001\u001a\f\u0012\u0005\u0012\u00030¼\u0001\u0018\u00010µ\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b-\u0010·\u0001\u001a\u0006\b½\u0001\u0010¸\u0001\"\u0005\bt\u0010º\u0001R*\u0010Ä\u0001\u001a\u0005\u0018\u00010¿\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u007f\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0005\b}\u0010Ã\u0001R+\u0010Ê\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010Æ\u0001\u001a\u0005\b;\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ð\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bz\u0010Ì\u0001\u001a\u0005\b7\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R,\u0010×\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R'\u0010Ù\u0001\u001a\u00020\f2\u0007\u0010Ø\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\bX\u0010P\"\u0005\b\u0090\u0001\u0010RR\u0013\u0010Û\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\u0019¨\u0006Þ\u0001"}, d2 = {"Lcom/harman/sdk/device/HmDevice;", "Ljava/io/Serializable;", "", "key", "", "o", "Lkotlin/H0;", "r0", "(Ljava/lang/String;Ljava/lang/Object;)V", "u", "(Ljava/lang/String;)Ljava/lang/Object;", "device", "", "N", "(Lcom/harman/sdk/device/HmDevice;)Z", "srcDevice", "a", "(Lcom/harman/sdk/device/HmDevice;)Lcom/harman/sdk/device/HmDevice;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/HashMap;", androidx.exifinterface.media.a.U4, "Ljava/util/HashMap;", "extraInfo", "F", "Ljava/lang/String;", "q", "n0", "(Ljava/lang/String;)V", "devicePid", "G", "r", "o0", "deviceVid", "H", "l0", "deviceMid", "I", "w", "t0", "firmwareVer", "J", "s", "p0", "dfuVersion", "K", "n", "k0", "deviceMAC", "L", "g", "b0", "bleAddress", "M", "p", "m0", "deviceName", "Lcom/harman/sdk/message/BatteryInfo;", "Lcom/harman/sdk/message/BatteryInfo;", "f", "()Lcom/harman/sdk/message/BatteryInfo;", "a0", "(Lcom/harman/sdk/message/BatteryInfo;)V", "batteryInfo", "Lcom/harman/sdk/utils/DeviceRole;", "O", "Lcom/harman/sdk/utils/DeviceRole;", "()Lcom/harman/sdk/utils/DeviceRole;", "J0", "(Lcom/harman/sdk/utils/DeviceRole;)V", "role", "P", "Z", "Q", "()Z", "f0", "(Z)V", "isConnectable", "k", "h0", "crc", "Lcom/harman/sdk/utils/DeviceProtocol;", "R", "Lcom/harman/sdk/utils/DeviceProtocol;", "()Lcom/harman/sdk/utils/DeviceProtocol;", "F0", "(Lcom/harman/sdk/utils/DeviceProtocol;)V", "preferredProtocol", "Lcom/harman/sdk/utils/AudioChannel;", androidx.exifinterface.media.a.T4, "Lcom/harman/sdk/utils/AudioChannel;", "i", "()Lcom/harman/sdk/utils/AudioChannel;", "e0", "(Lcom/harman/sdk/utils/AudioChannel;)V", "channel", androidx.exifinterface.media.a.f5, "C", "A0", "(I)V", "mtu", "Ljava/util/concurrent/atomic/AtomicBoolean;", "U", "Ljava/util/concurrent/atomic/AtomicBoolean;", "connected", androidx.exifinterface.media.a.Z4, "()Ljava/util/concurrent/atomic/AtomicBoolean;", "c0", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "isBleConnecting", androidx.exifinterface.media.a.V4, "isA2dpConnected", "", "X", "z", "()J", "w0", "(J)V", "lastTouchTime", "Y", "x", "u0", "firstTouchTime", "G0", "receivedContent", "I0", LoginActivity.f48951P, "h", "d0", "brightness", "m", "j0", "deviceIndex", "c", "audioSource", "autoPowerOff", "multiAI", "", "g0", "B", "v", "()B", "s0", "(B)V", "feedbackToneStatus", "z0", "mfbStatus", "i0", "y", "v0", "hfpStatus", "e", "bassVolume", "t", "q0", "eqMode", androidx.exifinterface.media.a.Y4, "x0", "lightStatus", "Lcom/harman/sdk/ota/RemoteOTAConfig;", "Lcom/harman/sdk/ota/RemoteOTAConfig;", "()Lcom/harman/sdk/ota/RemoteOTAConfig;", "H0", "(Lcom/harman/sdk/ota/RemoteOTAConfig;)V", "remoteOTAConfig", "y0", "isLinkableOnMobile", "platform", "E0", "B0", "isOTARestartPhase", "C0", "isOTAStarted", "l", "delayDuration", "Ljava/util/LinkedList;", "Lcom/harman/sdk/message/SimpleEQSettings;", "Ljava/util/LinkedList;", "()Ljava/util/LinkedList;", "K0", "(Ljava/util/LinkedList;)V", "simpleEQSettings", "Lcom/harman/sdk/message/AdvancedEQSettings;", b.f47574c, "advancedEQSettings", "Lcom/harman/sdk/message/AuracastInfo;", "Lcom/harman/sdk/message/AuracastInfo;", "d", "()Lcom/harman/sdk/message/AuracastInfo;", "(Lcom/harman/sdk/message/AuracastInfo;)V", "auracastInfo", "Lcom/harman/sdk/message/TWSInfo;", "Lcom/harman/sdk/message/TWSInfo;", "()Lcom/harman/sdk/message/TWSInfo;", "M0", "(Lcom/harman/sdk/message/TWSInfo;)V", "twsInfo", "Lcom/harman/sdk/utils/EnumSyncOnOff;", "Lcom/harman/sdk/utils/EnumSyncOnOff;", "()Lcom/harman/sdk/utils/EnumSyncOnOff;", "L0", "(Lcom/harman/sdk/utils/EnumSyncOnOff;)V", "syncOnOff", "Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "D", "()Lcom/harman/sdk/message/OneTouchMusicButtonSettings;", "D0", "(Lcom/harman/sdk/message/OneTouchMusicButtonSettings;)V", "oneTouchMusicButtonSettings", "value", "isConnected", "j", "connectAddress", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHmDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmDevice.kt\ncom/harman/sdk/device/HmDevice\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,441:1\n1#2:442\n*E\n"})
/* loaded from: classes2.dex */
public class HmDevice implements Serializable {

    /* renamed from: A0, reason: collision with root package name */
    public static final byte f47746A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public static final byte f47747B0 = 1;

    /* renamed from: C0, reason: collision with root package name */
    public static final byte f47748C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    public static final byte f47749D0 = 1;

    /* renamed from: E0, reason: collision with root package name */
    public static final byte f47750E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public static final byte f47751F0 = 1;

    /* renamed from: G0, reason: collision with root package name */
    public static final byte f47752G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    public static final byte f47753H0 = 1;

    /* renamed from: I0, reason: collision with root package name */
    public static final byte f47754I0 = 1;

    /* renamed from: J0, reason: collision with root package name */
    public static final byte f47755J0 = 0;

    /* renamed from: K0, reason: collision with root package name */
    public static final byte f47756K0 = 0;

    /* renamed from: L0, reason: collision with root package name */
    public static final byte f47757L0 = 1;

    /* renamed from: M0, reason: collision with root package name */
    public static final byte f47758M0 = 1;

    /* renamed from: N0, reason: collision with root package name */
    public static final byte f47759N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    @d
    public static final String f47760O0 = "KEY_BR_EDR_RX_TX_UUID";

    /* renamed from: P0, reason: collision with root package name */
    @d
    public static final String f47761P0 = "KEY_CRC16_CLASSIC_BT_ADDRESS";

    /* renamed from: Q0, reason: collision with root package name */
    @d
    public static final String f47762Q0 = "KEY_TWS_LINKED_DEVICE";

    /* renamed from: y0, reason: collision with root package name */
    @d
    public static final a f47763y0 = new a(null);

    /* renamed from: z0, reason: collision with root package name */
    public static final byte f47764z0 = -1;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("deviceVid")
    @e
    private String f47767G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("deviceMid")
    @e
    private String f47768H;

    /* renamed from: N, reason: collision with root package name */
    @SerializedName("masterBatteryLevel")
    @e
    private BatteryInfo f47774N;

    /* renamed from: P, reason: collision with root package name */
    @SerializedName("isConnectable")
    private boolean f47776P;

    /* renamed from: Q, reason: collision with root package name */
    @SerializedName("crc")
    @e
    private String f47777Q;

    /* renamed from: W, reason: collision with root package name */
    @SerializedName("a2dpConnected")
    private boolean f47783W;

    /* renamed from: X, reason: collision with root package name */
    @SerializedName("lastTouchTime")
    private long f47784X;

    /* renamed from: Y, reason: collision with root package name */
    @SerializedName("firstTouchTime")
    private long f47785Y;

    /* renamed from: Z, reason: collision with root package name */
    @SerializedName("receivedContent")
    @e
    private String f47786Z;

    /* renamed from: a0, reason: collision with root package name */
    @SerializedName("receivedResponse")
    @e
    private String f47787a0;

    /* renamed from: d0, reason: collision with root package name */
    @SerializedName("audioSource")
    private int f47790d0;

    /* renamed from: e0, reason: collision with root package name */
    @SerializedName("autoPowerOff")
    private final int f47791e0;

    /* renamed from: f0, reason: collision with root package name */
    @SerializedName("multiAI")
    private final int f47792f0;

    /* renamed from: m0, reason: collision with root package name */
    @SerializedName("remoteOTAConfig")
    @e
    private RemoteOTAConfig f47799m0;

    /* renamed from: n0, reason: collision with root package name */
    @SerializedName("linkableOnMobile")
    private boolean f47800n0;

    /* renamed from: p0, reason: collision with root package name */
    @SerializedName("isOTARestartPhase")
    private boolean f47802p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f47803q0;

    /* renamed from: s0, reason: collision with root package name */
    @SerializedName("generalEQSettings")
    @e
    private LinkedList<SimpleEQSettings> f47805s0;

    /* renamed from: t0, reason: collision with root package name */
    @SerializedName("advancedEQSettings")
    @e
    private LinkedList<AdvancedEQSettings> f47806t0;

    /* renamed from: u0, reason: collision with root package name */
    @SerializedName("auracastInfo")
    @e
    private AuracastInfo f47807u0;

    /* renamed from: v0, reason: collision with root package name */
    @SerializedName("twsInfo")
    @e
    private TWSInfo f47808v0;

    /* renamed from: w0, reason: collision with root package name */
    @SerializedName("syncOnOff")
    @e
    private EnumSyncOnOff f47809w0;

    /* renamed from: x0, reason: collision with root package name */
    @SerializedName("oneTouchMusicButtonSettings")
    @e
    private OneTouchMusicButtonSettings f47810x0;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("extraInfo")
    @d
    private final HashMap<String, Object> f47765E = new HashMap<>();

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("devicePid")
    @d
    private String f47766F = "";

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("firmwareVer")
    @d
    private String f47769I = "";

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("dfuVersion")
    @d
    private String f47770J = "";

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("deviceMAC")
    @d
    private String f47771K = "";

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("bleAddress")
    @d
    private String f47772L = "";

    /* renamed from: M, reason: collision with root package name */
    @SerializedName("deviceName")
    @d
    private String f47773M = "";

    /* renamed from: O, reason: collision with root package name */
    @SerializedName("role")
    @d
    private DeviceRole f47775O = DeviceRole.NORMAL;

    /* renamed from: R, reason: collision with root package name */
    @SerializedName("preferredProtocol")
    @d
    private DeviceProtocol f47778R = DeviceProtocol.PROTOCOL_UNKNOWN;

    /* renamed from: S, reason: collision with root package name */
    @SerializedName("channel")
    @d
    private AudioChannel f47779S = AudioChannel.UNKNOWN;

    /* renamed from: T, reason: collision with root package name */
    @SerializedName("mtu")
    private int f47780T = 23;

    /* renamed from: U, reason: collision with root package name */
    @SerializedName("connectState")
    @d
    private final AtomicBoolean f47781U = new AtomicBoolean(false);

    /* renamed from: V, reason: collision with root package name */
    @SerializedName("isBleConnecting")
    @d
    private AtomicBoolean f47782V = new AtomicBoolean(false);

    /* renamed from: b0, reason: collision with root package name */
    @SerializedName("brightness")
    private int f47788b0 = -1;

    /* renamed from: c0, reason: collision with root package name */
    @SerializedName("deviceIndex")
    private int f47789c0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    @SerializedName("feedbackToneStatus")
    private byte f47793g0 = -1;

    /* renamed from: h0, reason: collision with root package name */
    @SerializedName("mfbStatus")
    private byte f47794h0 = -1;

    /* renamed from: i0, reason: collision with root package name */
    @SerializedName("hfpStatus")
    private byte f47795i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    @SerializedName("bassVolume")
    private int f47796j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    @SerializedName("eqMode")
    private byte f47797k0 = -1;

    /* renamed from: l0, reason: collision with root package name */
    @SerializedName("lightStatus")
    private byte f47798l0 = -1;

    /* renamed from: o0, reason: collision with root package name */
    @SerializedName("platform")
    @d
    private String f47801o0 = "";

    /* renamed from: r0, reason: collision with root package name */
    private long f47804r0 = C0909k.f15658a;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public final byte A() {
        return this.f47798l0;
    }

    public final void A0(int i4) {
        this.f47780T = i4;
    }

    public final byte B() {
        return this.f47794h0;
    }

    public final void B0(boolean z3) {
        this.f47802p0 = z3;
    }

    public final int C() {
        return this.f47780T;
    }

    public final void C0(boolean z3) {
        this.f47803q0 = z3;
    }

    @e
    public final OneTouchMusicButtonSettings D() {
        return this.f47810x0;
    }

    public final void D0(@e OneTouchMusicButtonSettings oneTouchMusicButtonSettings) {
        this.f47810x0 = oneTouchMusicButtonSettings;
    }

    @d
    public final String E() {
        return this.f47801o0;
    }

    public final void E0(@d String platform) {
        F.p(platform, "platform");
        if (!TextUtils.isEmpty(platform)) {
            this.f47801o0 = platform;
        }
    }

    @d
    public final DeviceProtocol F() {
        return this.f47778R;
    }

    public final void F0(@d DeviceProtocol deviceProtocol) {
        F.p(deviceProtocol, "<set-?>");
        this.f47778R = deviceProtocol;
    }

    @e
    public final String G() {
        return this.f47786Z;
    }

    public final void G0(@e String str) {
        this.f47786Z = str;
    }

    @e
    public final RemoteOTAConfig H() {
        return this.f47799m0;
    }

    public final void H0(@e RemoteOTAConfig remoteOTAConfig) {
        this.f47799m0 = remoteOTAConfig;
    }

    @e
    public final String I() {
        return this.f47787a0;
    }

    public final void I0(@e String str) {
        this.f47787a0 = str;
    }

    @d
    public final DeviceRole J() {
        return this.f47775O;
    }

    public final void J0(@d DeviceRole deviceRole) {
        F.p(deviceRole, "<set-?>");
        this.f47775O = deviceRole;
    }

    @e
    public final LinkedList<SimpleEQSettings> K() {
        return this.f47805s0;
    }

    public final void K0(@e LinkedList<SimpleEQSettings> linkedList) {
        this.f47805s0 = linkedList;
    }

    @e
    public final EnumSyncOnOff L() {
        return this.f47809w0;
    }

    public final void L0(@e EnumSyncOnOff enumSyncOnOff) {
        this.f47809w0 = enumSyncOnOff;
    }

    @e
    public final TWSInfo M() {
        return this.f47808v0;
    }

    public final void M0(@e TWSInfo tWSInfo) {
        this.f47808v0 = tWSInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(@l3.e com.harman.sdk.device.HmDevice r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L29
            java.lang.String r1 = r5.f47771K
            int r1 = r1.length()
            r2 = 1
            if (r1 <= 0) goto L16
            java.lang.String r1 = r5.f47771K
            java.lang.String r3 = r4.f47771K
            boolean r1 = kotlin.text.q.K1(r1, r3, r2)
            if (r1 != 0) goto L28
        L16:
            java.lang.String r1 = r5.f47772L
            int r1 = r1.length()
            if (r1 <= 0) goto L29
            java.lang.String r5 = r5.f47772L
            java.lang.String r1 = r4.f47772L
            boolean r5 = kotlin.text.q.K1(r5, r1, r2)
            if (r5 == 0) goto L29
        L28:
            r0 = r2
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.device.HmDevice.N(com.harman.sdk.device.HmDevice):boolean");
    }

    public final boolean O() {
        return this.f47783W;
    }

    @d
    public final AtomicBoolean P() {
        return this.f47782V;
    }

    public final boolean Q() {
        return this.f47776P;
    }

    public final boolean R() {
        return this.f47781U.get();
    }

    public final boolean S() {
        return this.f47800n0;
    }

    public final boolean T() {
        return this.f47802p0;
    }

    public final boolean U() {
        return this.f47803q0;
    }

    public final void V(boolean z3) {
        this.f47783W = z3;
    }

    public final void W(@e LinkedList<AdvancedEQSettings> linkedList) {
        this.f47806t0 = linkedList;
    }

    public final void X(int i4) {
        this.f47790d0 = i4;
    }

    public final void Y(@e AuracastInfo auracastInfo) {
        this.f47807u0 = auracastInfo;
    }

    public final void Z(int i4) {
        this.f47796j0 = i4;
    }

    @d
    public final HmDevice a(@e HmDevice hmDevice) {
        Field[] declaredFields = HmDevice.class.getDeclaredFields();
        F.m(declaredFields);
        for (Field field : declaredFields) {
            if (!F.g(field.getName(), "serialVersionUID")) {
                field.setAccessible(true);
                try {
                    field.set(this, field.get(hmDevice));
                } catch (Exception unused) {
                }
            }
        }
        return this;
    }

    public final void a0(@e BatteryInfo batteryInfo) {
        this.f47774N = batteryInfo;
    }

    @e
    public final LinkedList<AdvancedEQSettings> b() {
        return this.f47806t0;
    }

    public final void b0(@d String str) {
        F.p(str, "<set-?>");
        this.f47772L = str;
    }

    public final int c() {
        return this.f47790d0;
    }

    public final void c0(@d AtomicBoolean atomicBoolean) {
        F.p(atomicBoolean, "<set-?>");
        this.f47782V = atomicBoolean;
    }

    @e
    public final AuracastInfo d() {
        return this.f47807u0;
    }

    public final void d0(int i4) {
        this.f47788b0 = i4;
    }

    public final int e() {
        return this.f47796j0;
    }

    public final void e0(@d AudioChannel audioChannel) {
        F.p(audioChannel, "<set-?>");
        this.f47779S = audioChannel;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.g(getClass(), obj.getClass())) {
            return F.g(j(), ((HmDevice) obj).j());
        }
        return false;
    }

    @e
    public final BatteryInfo f() {
        return this.f47774N;
    }

    public final void f0(boolean z3) {
        this.f47776P = z3;
    }

    @d
    public final String g() {
        return this.f47772L;
    }

    public final void g0(boolean z3) {
        Log.d("xiaoming", this.f47773M + " isConnected setValue = " + z3);
        this.f47781U.set(z3);
    }

    public final int h() {
        return this.f47788b0;
    }

    public final void h0(@e String str) {
        this.f47777Q = str;
    }

    public int hashCode() {
        return Objects.hash(j());
    }

    @d
    public final AudioChannel i() {
        return this.f47779S;
    }

    public final void i0(long j4) {
        this.f47804r0 = j4;
    }

    @d
    public final String j() {
        if (this.f47778R == DeviceProtocol.PROTOCOL_BLE) {
            return this.f47772L;
        }
        return this.f47771K;
    }

    public final void j0(int i4) {
        this.f47789c0 = i4;
    }

    @e
    public final String k() {
        return this.f47777Q;
    }

    public final void k0(@d String str) {
        F.p(str, "<set-?>");
        this.f47771K = str;
    }

    public final long l() {
        long j4 = this.f47804r0;
        if (j4 < 1000) {
            return 1000L;
        }
        return j4;
    }

    public final void l0(@e String str) {
        this.f47768H = str;
    }

    public final int m() {
        return this.f47789c0;
    }

    public final void m0(@d String str) {
        F.p(str, "<set-?>");
        this.f47773M = str;
    }

    @d
    public final String n() {
        return this.f47771K;
    }

    public final void n0(@d String str) {
        F.p(str, "<set-?>");
        this.f47766F = str;
    }

    @e
    public final String o() {
        return this.f47768H;
    }

    public final void o0(@e String str) {
        this.f47767G = str;
    }

    @d
    public final String p() {
        return this.f47773M;
    }

    public final void p0(@d String str) {
        F.p(str, "<set-?>");
        this.f47770J = str;
    }

    @d
    public final String q() {
        return this.f47766F;
    }

    public final void q0(byte b4) {
        this.f47797k0 = b4;
    }

    @e
    public final String r() {
        return this.f47767G;
    }

    public final void r0(@d String key, @e Object obj) {
        F.p(key, "key");
        if (obj != null) {
            this.f47765E.put(key, obj);
        } else {
            this.f47765E.remove(key);
        }
    }

    @d
    public final String s() {
        return this.f47770J;
    }

    public final void s0(byte b4) {
        this.f47793g0 = b4;
    }

    public final byte t() {
        return this.f47797k0;
    }

    public final void t0(@d String str) {
        F.p(str, "<set-?>");
        this.f47769I = str;
    }

    @d
    public String toString() {
        HashMap<String, Object> hashMap = this.f47765E;
        String str = this.f47766F;
        String str2 = this.f47767G;
        String str3 = this.f47768H;
        String str4 = this.f47769I;
        String str5 = this.f47770J;
        String str6 = this.f47771K;
        String str7 = this.f47772L;
        String str8 = this.f47773M;
        BatteryInfo batteryInfo = this.f47774N;
        DeviceRole deviceRole = this.f47775O;
        boolean z3 = this.f47776P;
        String str9 = this.f47777Q;
        DeviceProtocol deviceProtocol = this.f47778R;
        AudioChannel audioChannel = this.f47779S;
        int i4 = this.f47780T;
        boolean R3 = R();
        boolean z4 = this.f47783W;
        long j4 = this.f47784X;
        long j5 = this.f47785Y;
        String str10 = this.f47786Z;
        String str11 = this.f47787a0;
        int i5 = this.f47788b0;
        int i6 = this.f47789c0;
        int i7 = this.f47790d0;
        int i8 = this.f47791e0;
        int i9 = this.f47792f0;
        byte b4 = this.f47793g0;
        byte b5 = this.f47794h0;
        byte b6 = this.f47795i0;
        int i10 = this.f47796j0;
        byte b7 = this.f47797k0;
        byte b8 = this.f47798l0;
        return "HmDevice(extraInfo=" + hashMap + ", devicePid='" + str + "', deviceVid=" + str2 + ", deviceMid=" + str3 + ", firmwareVer='" + str4 + "', dfuVersion='" + str5 + "', deviceMAC='" + str6 + "', bleAddress='" + str7 + "', deviceName='" + str8 + "', batteryInfo=" + batteryInfo + ", role=" + deviceRole + ", isConnectable=" + z3 + ", crc=" + str9 + ", preferredProtocol=" + deviceProtocol + ", channel=" + audioChannel + ", mtu=" + i4 + ", isConnected=" + R3 + ", isA2dpConnected=" + z4 + ", lastTouchTime=" + j4 + ", firstTouchTime=" + j5 + ", receivedContent=" + str10 + ", response=" + str11 + ", brightness=" + i5 + ", deviceIndex=" + i6 + ", audioSource=" + i7 + ", autoPowerOff=" + i8 + ", multiAI=" + i9 + ", feedbackToneStatus=" + ((int) b4) + ", mfbStatus=" + ((int) b5) + ", hfpStatus=" + ((int) b6) + ", bassVolume=" + i10 + ", eqMode=" + ((int) b7) + ", lightStatus=" + ((int) b8) + ", remoteOTAConfig=" + this.f47799m0 + ", isLinkableOnMobile=" + this.f47800n0 + ", platform='" + this.f47801o0 + "', simpleEQSettings=" + this.f47805s0 + "), auracast='" + this.f47807u0 + "', tws='" + this.f47808v0 + "', syncOnOff='" + this.f47809w0 + "', isOTARestartPhase = '" + this.f47802p0 + "', hash: " + System.identityHashCode(this);
    }

    @e
    public final Object u(@d String key) {
        F.p(key, "key");
        return this.f47765E.get(key);
    }

    public final void u0(long j4) {
        this.f47785Y = j4;
    }

    public final byte v() {
        return this.f47793g0;
    }

    public final void v0(byte b4) {
        this.f47795i0 = b4;
    }

    @d
    public final String w() {
        return this.f47769I;
    }

    public final void w0(long j4) {
        this.f47784X = j4;
    }

    public final long x() {
        return this.f47785Y;
    }

    public final void x0(byte b4) {
        this.f47798l0 = b4;
    }

    public final byte y() {
        return this.f47795i0;
    }

    public final void y0(boolean z3) {
        this.f47800n0 = z3;
    }

    public final long z() {
        return this.f47784X;
    }

    public final void z0(byte b4) {
        this.f47794h0 = b4;
    }
}
