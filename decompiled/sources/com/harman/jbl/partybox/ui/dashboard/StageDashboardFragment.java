package com.harman.jbl.partybox.ui.dashboard;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.A3;
import com.harman.jbl.partybox.databinding.B3;
import com.harman.jbl.partybox.databinding.C1868f1;
import com.harman.jbl.partybox.databinding.C1885i3;
import com.harman.jbl.partybox.databinding.C1890j3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.model.ClickEventType;
import com.harman.jbl.partybox.ui.bassboost.BassBoostFragment;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.C2005p;
import com.harman.jbl.partybox.ui.dashboard.DashboardBannerViewModel;
import com.harman.jbl.partybox.ui.dashboard.z0;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.effectlab.EffectLabActivity;
import com.harman.jbl.partybox.ui.equalizer.d;
import com.harman.jbl.partybox.ui.main.MainActivityNav;
import com.harman.jbl.partybox.ui.musiccontrol.StageMusicControlFragment;
import com.harman.jbl.partybox.ui.oobe.OnBoardingTutorialFragment;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoRenameFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import com.harman.jbl.partybox.ui.widget.ForegroundMaskLayout;
import com.harman.jbl.partybox.ui.widget.GroupSpeakerView;
import com.harman.jbl.partybox.ui.widget.MatchWidthCardView;
import com.harman.rating.model.RatingGuideType;
import com.harman.rating.model.UserAction;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.AdvancedEQSettings;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.EQCategory;
import com.harman.sdk.message.OneTouchMusicButtonSettings;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.PartyConnectStatus;
import com.spotify.sdk.android.auth.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import q2.b;
import s2.C2410a;

@kotlin.E(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002·\u0001\u0018\u0000 È\u00012\u00020\u00012\u00020\u0002:\u0004É\u0001Ê\u0001B\b¢\u0006\u0005\bÇ\u0001\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0010J\u0013\u0010'\u001a\u00020\u0003*\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010\u0005J\u0017\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u0010\u0005J\u0017\u00100\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b0\u0010\u0019J#\u00104\u001a\u0002032\b\b\u0002\u00101\u001a\u00020\u001a2\b\b\u0002\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u0010\u0005J\u001d\u00109\u001a\u00020\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e07H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u001aH\u0002¢\u0006\u0004\b<\u0010=J-\u0010C\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bC\u0010DJ#\u0010F\u001a\u00020>2\u0006\u0010E\u001a\u00020>2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bH\u0010\u0005J\u000f\u0010I\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010\u0005J\u000f\u0010J\u001a\u00020\u0003H\u0002¢\u0006\u0004\bJ\u0010\u0005J\u000f\u0010K\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010\u0005J\u000f\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bL\u0010\u0005J\u000f\u0010M\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010\u0005J\u000f\u0010N\u001a\u00020\u0003H\u0002¢\u0006\u0004\bN\u0010\u0005J\u000f\u0010O\u001a\u00020\u0003H\u0002¢\u0006\u0004\bO\u0010\u0005J\u0017\u0010P\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bP\u0010\u0010J\u0017\u0010Q\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bQ\u0010\u0010J\u001b\u0010S\u001a\u00020\u0003*\u00020R2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bS\u0010TJ\u001b\u0010U\u001a\u00020\u0003*\u00020R2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bU\u0010TJ\u0013\u0010V\u001a\u00020\u001a*\u00020\rH\u0002¢\u0006\u0004\bV\u0010WJ\u001b\u0010Z\u001a\u00020\u0003*\u00020X2\u0006\u0010Y\u001a\u00020>H\u0002¢\u0006\u0004\bZ\u0010[J!\u0010^\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020R2\b\b\u0001\u0010]\u001a\u00020>H\u0002¢\u0006\u0004\b^\u0010_J!\u0010b\u001a\u00020\u00032\u0006\u0010a\u001a\u00020`2\b\b\u0001\u0010]\u001a\u00020>H\u0002¢\u0006\u0004\bb\u0010cJ\u0013\u0010e\u001a\u00020\u0003*\u00020dH\u0002¢\u0006\u0004\be\u0010fJ\u0013\u0010g\u001a\u00020\u0003*\u00020dH\u0002¢\u0006\u0004\bg\u0010fJ\u000f\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ#\u0010m\u001a\u00020l2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010k\u001a\u00020\u0016H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bo\u0010\u0010J\u0019\u0010r\u001a\u00020\u00032\b\u0010q\u001a\u0004\u0018\u00010pH\u0016¢\u0006\u0004\br\u0010sJ!\u0010u\u001a\u00020\u00032\u0006\u0010t\u001a\u00020d2\b\u0010q\u001a\u0004\u0018\u00010pH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0003H\u0016¢\u0006\u0004\bw\u0010\u0005J\u000f\u0010x\u001a\u00020\u0003H\u0016¢\u0006\u0004\bx\u0010\u0005J\u000f\u0010y\u001a\u00020\u0003H\u0016¢\u0006\u0004\by\u0010\u0005J\u000f\u0010z\u001a\u00020\u0003H\u0016¢\u0006\u0004\bz\u0010\u0005J\u0019\u0010}\u001a\u00020\u00032\b\u0010|\u001a\u0004\u0018\u00010{H\u0016¢\u0006\u0004\b}\u0010~J(\u0010\u0080\u0001\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001e2\b\u0010\u007f\u001a\u0004\u0018\u00010\u001eH\u0086@ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u001e¢\u0006\u0005\b\u0082\u0001\u0010!J\u000f\u0010\u0083\u0001\u001a\u00020\u0003¢\u0006\u0005\b\u0083\u0001\u0010\u0005R\u001f\u0010\u0087\u0001\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b4\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\u008d\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0091\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b+\u0010\u008a\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u008a\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u008a\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u009d\u0001R\u001b\u0010¡\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010 \u0001R\u001b\u0010¤\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010£\u0001R\u0018\u0010¦\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bS\u0010¥\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010®\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u00ad\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R!\u0010¿\u0001\u001a\u00030»\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u008a\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R \u0010Ã\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b)\u0010\u008a\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0017\u0010Æ\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010Å\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ë\u0001"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lcom/harman/jbl/partybox/ui/widget/q;", "Lkotlin/H0;", "x1", "()V", "y1", "l1", "V0", "W0", "initView", "o2", com.harman.sdk.utils.k.f48628W, "Lcom/harman/sdk/device/PartyBoxDevice;", "mainDevice", "Y1", "(Lcom/harman/sdk/device/PartyBoxDevice;)V", "g2", "e2", "t2", "Q1", "l2", "", "deviceMac", "k2", "(Ljava/lang/String;)V", "", "M1", "()Z", "N1", "Lcom/harman/sdk/device/HmDevice;", "device", "t1", "(Lcom/harman/sdk/device/HmDevice;)V", "hmDevice", "s2", "A2", "i2", "Landroidx/fragment/app/DialogFragment;", "V1", "(Landroidx/fragment/app/DialogFragment;)V", "g1", "devicePid", "S0", "u1", "T1", "v2", "D1", "u2", "otaAvailable", "micOtaAvailable", "Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$UpdateEnum;", "Q0", "(ZZ)Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$UpdateEnum;", "R1", "", "list", "U1", "(Ljava/util/List;)V", "isSuccess", "y2", "(Z)V", "", androidx.core.app.C0.f11537F0, "Lcom/harman/sdk/message/WirelessMicInfo;", "wirelessMicInfo", "deviceMid", "w2", "(ILcom/harman/sdk/message/WirelessMicInfo;Ljava/lang/String;)V", "genVersion", "o1", "(ILjava/lang/String;)I", "n2", "X0", "A1", "W1", "C1", "z1", "w1", "m2", "D2", "E2", "Lcom/harman/jbl/partybox/databinding/j3;", "Z0", "(Lcom/harman/jbl/partybox/databinding/j3;Lcom/harman/sdk/device/PartyBoxDevice;)V", "b1", "O1", "(Lcom/harman/sdk/device/PartyBoxDevice;)Z", "Lcom/harman/jbl/partybox/databinding/f1;", b.c.f48986a, "S1", "(Lcom/harman/jbl/partybox/databinding/f1;I)V", "layoutStereoEntranceBinding", "resID", "B2", "(Lcom/harman/jbl/partybox/databinding/j3;I)V", "Lcom/harman/jbl/partybox/databinding/B3;", "layoutTwsEntranceBinding", "C2", "(Lcom/harman/jbl/partybox/databinding/B3;I)V", "Landroid/view/View;", "P1", "(Landroid/view/View;)V", "r2", "Landroid/widget/LinearLayout$LayoutParams;", "Y0", "()Landroid/widget/LinearLayout$LayoutParams;", "defaultDesc", "", "h1", "(Lcom/harman/sdk/device/PartyBoxDevice;Ljava/lang/String;)Ljava/lang/CharSequence;", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "onDestroy", "onDestroyView", "Lcom/harman/jbl/partybox/model/ClickEventType;", "actionName", "onAction", "(Lcom/harman/jbl/partybox/model/ClickEventType;)V", "coDevice", "onUngroupBtnClick", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/device/HmDevice;Lkotlin/coroutines/c;)Ljava/lang/Object;", "onUnGroupSuccess", "onBannerInAPlayTogetherPartyClicked", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "j1", "()Lcom/harman/jbl/partybox/databinding/f1;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "n1", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/dashboard/E0;", "s1", "()Lcom/harman/jbl/partybox/ui/dashboard/E0;", "stageDashboardViewModel", "Lcom/harman/jbl/partybox/ui/equalizer/e;", "T0", "r1", "()Lcom/harman/jbl/partybox/ui/equalizer/e;", "presetEQViewModel", "Lcom/harman/jbl/partybox/ui/equalizer/a;", "U0", "m1", "()Lcom/harman/jbl/partybox/ui/equalizer/a;", "eqViewModel", "Lcom/harman/jbl/partybox/ui/musiccontrol/StageMusicControlFragment;", "Lcom/harman/jbl/partybox/ui/musiccontrol/StageMusicControlFragment;", "musicControlFragment", "Lcom/harman/jbl/partybox/ui/bassboost/BassBoostFragment;", "Lcom/harman/jbl/partybox/ui/bassboost/BassBoostFragment;", "bassBoostFragment", "Lcom/harman/jbl/partybox/databinding/i3;", "Lcom/harman/jbl/partybox/databinding/i3;", "softwareUpdateBinding", "Z", "isDaisyChainSecondaryEnabled", "isDaisyChainPrimaryEnabled", "Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", com.harman.sdk.utils.k.f48625V, "Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", "removeProductDialogFragment", "Lcom/harman/jbl/partybox/ui/dashboard/StereoQuitDialogFragment;", "Lcom/harman/jbl/partybox/ui/dashboard/StereoQuitDialogFragment;", "stereoQuitDialog", "Lcom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment;", com.harman.sdk.utils.k.f48619T, "Lcom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment;", "onBoardingTutorialFragment", "Lcom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog;", "d1", "Lcom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog;", "stereoEffectDialog", "com/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$d", "e1", "Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$d;", "deviceMgrObserver", "Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel;", "f1", "k1", "()Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel;", "dashboardBannerViewModel", "Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerDialogFragment;", "q1", "()Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerDialogFragment;", "oneProductMissingTipsDialog", "Lcom/harman/jbl/partybox/ui/equalizer/d$c;", "Lcom/harman/jbl/partybox/ui/equalizer/d$c;", "eqSelectedListener", "<init>", "Companion", "a", "UpdateEnum", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nStageDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageDashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1876:1\n66#2,4:1877\n56#3,10:1881\n56#3,10:1891\n56#3,10:1901\n56#3,10:1911\n1#4:1921\n262#5,2:1922\n262#5,2:1924\n262#5,2:1926\n262#5,2:1928\n262#5,2:1930\n262#5,2:1932\n262#5,2:1934\n262#5,2:1936\n262#5,2:1938\n262#5,2:1940\n262#5,2:1942\n262#5,2:1944\n262#5,2:1948\n262#5,2:1950\n262#5,2:1952\n262#5,2:1954\n262#5,2:1956\n260#5,4:1958\n260#5:1962\n262#5,2:1963\n262#5,2:1965\n262#5,2:1967\n262#5,2:1969\n262#5,2:1971\n262#5,2:1973\n262#5,2:1975\n262#5,2:1977\n262#5,2:1979\n262#5,2:1981\n288#6,2:1946\n*S KotlinDebug\n*F\n+ 1 StageDashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment\n*L\n92#1:1877,4\n95#1:1881,10\n96#1:1891,10\n97#1:1901,10\n756#1:1911,10\n347#1:1922,2\n348#1:1924,2\n349#1:1926,2\n699#1:1928,2\n701#1:1930,2\n705#1:1932,2\n710#1:1934,2\n714#1:1936,2\n716#1:1938,2\n719#1:1940,2\n765#1:1942,2\n784#1:1944,2\n1207#1:1948,2\n1228#1:1950,2\n1229#1:1952,2\n1535#1:1954,2\n1544#1:1956,2\n1585#1:1958,4\n1590#1:1962\n1596#1:1963,2\n1597#1:1965,2\n1598#1:1967,2\n1629#1:1969,2\n1642#1:1971,2\n1643#1:1973,2\n1684#1:1975,2\n1686#1:1977,2\n1843#1:1979,2\n1852#1:1981,2\n1162#1:1946,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StageDashboardFragment extends BackDispatcherFragment implements com.harman.jbl.partybox.ui.widget.q {

    @l3.d
    public static final String TAG = "StageDashboardFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43075Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43076R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43077S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43078T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43079U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.e
    private StageMusicControlFragment f43080V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.e
    private BassBoostFragment f43081W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.e
    private C1885i3 f43082X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f43083Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f43084Z0;

    /* renamed from: a1, reason: collision with root package name */
    @l3.e
    private RemoveProductDialogFragment f43085a1;

    /* renamed from: b1, reason: collision with root package name */
    @l3.e
    private StereoQuitDialogFragment f43086b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.e
    private OnBoardingTutorialFragment f43087c1;

    /* renamed from: d1, reason: collision with root package name */
    @l3.e
    private StereoEffectDialog f43088d1;

    /* renamed from: e1, reason: collision with root package name */
    @l3.d
    private final C1972d f43089e1;

    /* renamed from: f1, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43090f1;

    /* renamed from: g1, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43091g1;

    /* renamed from: h1, reason: collision with root package name */
    @l3.d
    private final d.c f43092h1;

    /* renamed from: i1, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f43074i1 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(StageDashboardFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentStageDashboardBinding;", 0))};

    @l3.d
    public static final C1969a Companion = new C1969a(null);

    /* loaded from: classes2.dex */
    static final class A extends Lambda implements X2.a<DashboardBannerDialogFragment> {
        A() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final DashboardBannerDialogFragment n() {
            StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
            return new DashboardBannerDialogFragment(stageDashboardFragment, stageDashboardFragment.k1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class B extends Lambda implements X2.a<kotlin.H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<HmDevice> f43111G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(Ref.ObjectRef<HmDevice> objectRef) {
            super(0);
            this.f43111G = objectRef;
        }

        public final void c() {
            StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
            z0.c l4 = z0.l(this.f43111G.f52301E, EnumStereoType.STEREO.g());
            kotlin.jvm.internal.F.o(l4, "actionToStereoScanFragment(...)");
            com.harman.jbl.partybox.utils.q.f(stageDashboardFragment, l4);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ kotlin.H0 n() {
            c();
            return kotlin.H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class C implements androidx.lifecycle.Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43112a;

        C(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f43112a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43112a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof androidx.lifecycle.Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43112a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class D extends Lambda implements X2.a<kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ PartyBoxDevice f43113F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ View f43114G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ StageDashboardFragment f43115H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(PartyBoxDevice partyBoxDevice, View view, StageDashboardFragment stageDashboardFragment) {
            super(0);
            this.f43113F = partyBoxDevice;
            this.f43114G = view;
            this.f43115H = stageDashboardFragment;
        }

        public final void c() {
            this.f43113F.O2(true);
            ((ImageView) this.f43114G).setImageResource(j.f.i4);
            E0 s12 = this.f43115H.s1();
            PartyBoxDevice partyBoxDevice = this.f43113F;
            s12.s0(partyBoxDevice, partyBoxDevice.u1());
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ kotlin.H0 n() {
            c();
            return kotlin.H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$showOneProductMissingBanner$1$1", f = "StageDashboardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class E extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43116I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyBoxDevice f43118K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(PartyBoxDevice partyBoxDevice, kotlin.coroutines.c<? super E> cVar) {
            super(2, cVar);
            this.f43118K = partyBoxDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43116I == 0) {
                kotlin.W.n(obj);
                StageDashboardFragment.this.k1().x(DashboardBannerViewModel.EnumBannerStyle.HOW_TO_FIND_THE_OTHER_SPEAKER);
                StageDashboardFragment.this.k1().w(this.f43118K);
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                stageDashboardFragment.V1(stageDashboardFragment.q1());
                return kotlin.H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((E) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new E(this.f43118K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class F extends Lambda implements X2.a<kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f43119F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ StageDashboardFragment f43120G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(String str, StageDashboardFragment stageDashboardFragment) {
            super(0);
            this.f43119F = str;
            this.f43120G = stageDashboardFragment;
        }

        public final void c() {
            com.harman.log.f.a(StageDashboardFragment.TAG, "BLE_LOG StageDashboardFragment RemoveProductDialogFragment :click remove");
            U1.a.k(this.f43119F);
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment updateUIPage:UiPage.PRODUCT_LIST>>>5");
            this.f43120G.n1().K2(this.f43119F);
            this.f43120G.n1().x2();
            this.f43120G.requireActivity().finish();
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ kotlin.H0 n() {
            c();
            return kotlin.H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$startWakeupDevice$2$1", f = "StageDashboardFragment.kt", i = {}, l = {365}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class G extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43121I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f43123K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(HmDevice hmDevice, kotlin.coroutines.c<? super G> cVar) {
            super(2, cVar);
            this.f43123K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43121I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                PartyBoxDashboardActivity.f42403l0.c(false);
                StageDashboardFragment.this.n1().N0(this.f43123K.n());
                E0 s12 = StageDashboardFragment.this.s1();
                HmDevice hmDevice = this.f43123K;
                this.f43121I = 1;
                obj = s12.w0(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                StageDashboardFragment.this.n1().P0(this.f43123K.n());
                StageDashboardFragment.this.n1().f3(true);
                StageDashboardFragment.this.y2(true);
                StageDashboardFragment.this.l1();
                com.harman.jbl.partybox.ui.main.o.G0(StageDashboardFragment.this.n1(), null, 1, null);
            } else {
                StageDashboardFragment.this.n1().O0(this.f43123K.n());
                StageDashboardFragment.this.n1().f3(false);
                StageDashboardFragment.this.y2(false);
            }
            PartyBoxDashboardActivity.f42403l0.c(true);
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((G) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new G(this.f43123K, cVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$UpdateEnum;", "", "(Ljava/lang/String;I)V", "UPDATE_NONE", "UPDATE_PARTY_BOX", "UPDATE_WIRELESS_MIC", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class UpdateEnum {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ UpdateEnum[] $VALUES;
        public static final UpdateEnum UPDATE_NONE = new UpdateEnum("UPDATE_NONE", 0);
        public static final UpdateEnum UPDATE_PARTY_BOX = new UpdateEnum("UPDATE_PARTY_BOX", 1);
        public static final UpdateEnum UPDATE_WIRELESS_MIC = new UpdateEnum("UPDATE_WIRELESS_MIC", 2);

        static {
            UpdateEnum[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private UpdateEnum(String str, int i4) {
        }

        private static final /* synthetic */ UpdateEnum[] b() {
            return new UpdateEnum[]{UPDATE_NONE, UPDATE_PARTY_BOX, UPDATE_WIRELESS_MIC};
        }

        @l3.d
        public static kotlin.enums.a<UpdateEnum> e() {
            return $ENTRIES;
        }

        public static UpdateEnum valueOf(String str) {
            return (UpdateEnum) Enum.valueOf(UpdateEnum.class, str);
        }

        public static UpdateEnum[] values() {
            return (UpdateEnum[]) $VALUES.clone();
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$a, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C1969a {
        public /* synthetic */ C1969a(C2197u c2197u) {
            this();
        }

        private C1969a() {
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$b, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    /* synthetic */ class C1970b extends FunctionReferenceImpl implements X2.l<View, C1868f1> {

        /* renamed from: N, reason: collision with root package name */
        public static final C1970b f43124N = new C1970b();

        C1970b() {
            super(1, C1868f1.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentStageDashboardBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1868f1 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return C1868f1.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$decoStereoState$4$1", f = "StageDashboardFragment.kt", i = {}, l = {1690}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$c, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C1971c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43125I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyBoxDevice f43127K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f43128L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1971c(PartyBoxDevice partyBoxDevice, HmDevice hmDevice, kotlin.coroutines.c<? super C1971c> cVar) {
            super(2, cVar);
            this.f43127K = partyBoxDevice;
            this.f43128L = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            HmDevice hmDevice;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43125I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                PartyBoxDevice partyBoxDevice = this.f43127K;
                if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(partyBoxDevice)) {
                    hmDevice = this.f43128L;
                } else {
                    hmDevice = null;
                }
                this.f43125I = 1;
                obj = stageDashboardFragment.onUngroupBtnClick(partyBoxDevice, hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                StageDashboardFragment.this.onUnGroupSuccess(this.f43127K);
            }
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((C1971c) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new C1971c(this.f43127K, this.f43128L, cVar);
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$d, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C1972d implements com.harman.sdk.c {
        C1972d() {
        }

        @Override // com.harman.sdk.c
        public void onA2DPConnected(@l3.e String str, boolean z3) {
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                if (z3 && kotlin.jvm.internal.F.g(k12.n(), str)) {
                    stageDashboardFragment.o2();
                }
            }
        }

        @Override // com.harman.sdk.c
        public void onBtEnabled(boolean z3) {
        }

        @Override // com.harman.sdk.c
        public void onLocationEnabled(boolean z3) {
        }

        @Override // com.harman.sdk.c
        public void onNetworkEnabled(boolean z3) {
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$e, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    static final class C1973e extends Lambda implements X2.p<com.harman.jbl.partybox.model.a, Boolean, kotlin.H0> {
        C1973e() {
            super(2);
        }

        public final void c(@l3.d com.harman.jbl.partybox.model.a eqPresetModel, boolean z3) {
            boolean T22;
            kotlin.jvm.internal.F.p(eqPresetModel, "eqPresetModel");
            com.harman.log.f.a(StageDashboardFragment.TAG, eqPresetModel.toString());
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment eqPresetModel: " + eqPresetModel);
            String f4 = eqPresetModel.f();
            String f5 = eqPresetModel.f();
            if (f5 != null) {
                T22 = kotlin.text.A.T2(f5, "SIGNATURE", false, 2, null);
                if (T22) {
                    f4 = "SIGNATURE";
                }
            }
            if (f4 == null) {
                f4 = "CUSTOM";
            }
            if (EQCategory.valueOf(f4) != EQCategory.CUSTOM) {
                StageDashboardFragment.this.j1().f39551M.g(8);
                ArrayList<com.harman.jbl.partybox.model.a> f6 = StageDashboardFragment.this.r1().e0().f();
                if (f6 != null && !f6.isEmpty()) {
                    HmDevice k12 = StageDashboardFragment.this.n1().k1();
                    if (k12 != null) {
                        StageDashboardFragment.this.m1().B(k12, eqPresetModel);
                        return;
                    }
                    return;
                }
                com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment eqPresetModel: stageDashboardViewModel.presetModelList.isNullOrEmpty()");
                return;
            }
            StageDashboardFragment.this.j1().f39551M.g(0);
            HmDevice k13 = StageDashboardFragment.this.n1().k1();
            if (k13 != null) {
                StageDashboardFragment.this.m1().z(k13, eqPresetModel);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ kotlin.H0 c0(com.harman.jbl.partybox.model.a aVar, Boolean bool) {
            c(aVar, bool.booleanValue());
            return kotlin.H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$initDynamicCard$1$1", f = "StageDashboardFragment.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$f, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C1974f extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43131I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f43133K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1974f(HmDevice hmDevice, kotlin.coroutines.c<? super C1974f> cVar) {
            super(2, cVar);
            this.f43133K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43131I;
            if (i4 != 0 && i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.W.n(obj);
            while (StageDashboardFragment.this.isAdded() && !StageDashboardFragment.this.isHidden() && StageDashboardFragment.this.isResumed()) {
                StageDashboardFragment.this.E2((PartyBoxDevice) this.f43133K);
                StageDashboardFragment.this.D2((PartyBoxDevice) this.f43133K);
                this.f43131I = 1;
                if (C2269d0.b(com.harman.jbl.partybox.ui.ota.business.a.f44562c, this) == l4) {
                    return l4;
                }
            }
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((C1974f) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new C1974f(this.f43133K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.jvm.internal.U({"SMAP\nStageDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageDashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$initObserver$10\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1876:1\n1#2:1877\n*E\n"})
    /* renamed from: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$g, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C1975g extends Lambda implements X2.l<com.harman.jbl.partybox.model.a, kotlin.H0> {
        C1975g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(com.harman.jbl.partybox.model.a aVar) {
            c(aVar);
            return kotlin.H0.f51801a;
        }

        public final void c(com.harman.jbl.partybox.model.a aVar) {
            String str;
            boolean K12;
            com.harman.jbl.partybox.model.d a4 = aVar.a();
            Integer num = null;
            if (a4 != null) {
                str = a4.g();
            } else {
                str = null;
            }
            com.harman.log.f.a(StageDashboardFragment.TAG, "eqPresetsLiveData observe called : " + str + " and isEQTHeme2 : ");
            K12 = kotlin.text.z.K1(aVar.f(), "custom", true);
            if (K12) {
                StageDashboardFragment.this.j1().f39551M.g(0);
            } else {
                StageDashboardFragment.this.j1().f39551M.g(8);
            }
            if (StageDashboardFragment.this.n1().k1() != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                stageDashboardFragment.j1().f39551M.d();
                stageDashboardFragment.j1().f39551M.setVisibility(0);
                stageDashboardFragment.j1().f39551M.setOnActionListener(stageDashboardFragment);
            }
            ArrayList<com.harman.jbl.partybox.model.a> f4 = StageDashboardFragment.this.r1().e0().f();
            if (f4 != null) {
                num = Integer.valueOf(f4.indexOf(aVar));
            }
            com.harman.log.f.a(StageDashboardFragment.TAG, "eq2Card setSmoothScroll called and position is " + num);
            if (num != null) {
                StageDashboardFragment.this.j1().f39551M.setSmoothScroll(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.jvm.internal.U({"SMAP\nStageDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageDashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$initObserver$11\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1876:1\n1#2:1877\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<ArrayList<com.harman.jbl.partybox.model.a>, kotlin.H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(ArrayList<com.harman.jbl.partybox.model.a> arrayList) {
            c(arrayList);
            return kotlin.H0.f51801a;
        }

        public final void c(ArrayList<com.harman.jbl.partybox.model.a> arrayList) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "presetEQDataList observe called list size: " + arrayList.size() + " ");
            Context context = StageDashboardFragment.this.getContext();
            if (context != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                stageDashboardFragment.j1().f39551M.e(context, arrayList, stageDashboardFragment.f43092h1);
            }
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment.this.r1().Y(k12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<Boolean, kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final i f43136F = new i();

        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "wakeupDeviceResult observe isConnected: " + bool + " ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<List<? extends HmDevice>, kotlin.H0> {
        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(List<? extends HmDevice> list) {
            c(list);
            return kotlin.H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment,samePidEffectDeviceList " + list.size());
            StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
            kotlin.jvm.internal.F.m(list);
            stageDashboardFragment.U1(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k extends Lambda implements X2.l<Boolean, kotlin.H0> {
        k() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment,ungroupSuccessLiveData called: " + bool);
            kotlin.jvm.internal.F.m(bool);
            if (bool.booleanValue()) {
                StageDashboardFragment.this.l2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements X2.l<String, kotlin.H0> {
        l() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(String str) {
            c(str);
            return kotlin.H0.f51801a;
        }

        public final void c(String str) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment,needToUngroupDeviceLiveData called: " + str);
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment,checkDeviceGroupInfo called: " + ((PartyBoxDevice) k12).l1().get("Device_Battery"));
                if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(k12)) {
                    stageDashboardFragment.s1().t0(k12);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements X2.l<String, kotlin.H0> {
        m() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(String str) {
            c(str);
            return kotlin.H0.f51801a;
        }

        public final void c(String str) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "renameLiveData called: " + str);
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment.this.s2((PartyBoxDevice) k12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.jvm.internal.U({"SMAP\nStageDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageDashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$initObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1876:1\n1#2:1877\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class n extends Lambda implements X2.l<kotlin.H0, kotlin.H0> {
        n() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(kotlin.H0 h02) {
            c(h02);
            return kotlin.H0.f51801a;
        }

        public final void c(kotlin.H0 h02) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment BLE_LOG twsInfoChangedLiveData : on observer");
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment.this.s1().i0(k12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o extends Lambda implements X2.l<PartyBoxDevice, kotlin.H0> {
        o() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return kotlin.H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "stageDashboardViewModel.connectDeviceLiveData called: " + partyBoxDevice);
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                PartyBoxDevice partyBoxDevice2 = (PartyBoxDevice) k12;
                stageDashboardFragment.g2(partyBoxDevice2);
                stageDashboardFragment.e2(partyBoxDevice2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p extends Lambda implements X2.l<HmDevice, kotlin.H0> {
        p() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return kotlin.H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "mainViewModel.connectDeviceLiveData called: " + hmDevice);
            StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
            kotlin.jvm.internal.F.m(hmDevice);
            stageDashboardFragment.t1(hmDevice);
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment stageDashboardFragment2 = StageDashboardFragment.this;
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                stageDashboardFragment2.n1().r3(k12);
                stageDashboardFragment2.a2();
                stageDashboardFragment2.t2(partyBoxDevice);
                stageDashboardFragment2.s2(k12);
                stageDashboardFragment2.v1(partyBoxDevice);
                stageDashboardFragment2.E2(partyBoxDevice);
                stageDashboardFragment2.D2(partyBoxDevice);
                stageDashboardFragment2.A2(partyBoxDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class q extends Lambda implements X2.l<Boolean, kotlin.H0> {
        q() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment BLEState currentDeviceBLEConnectStatus : observe callback " + bool);
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                if (!stageDashboardFragment.N1() && !k12.R() && PartyBoxDashboardActivity.f42403l0.a() && !bool.booleanValue()) {
                    stageDashboardFragment.Q1();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class r extends Lambda implements X2.l<String, kotlin.H0> {
        r() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(String str) {
            c(str);
            return kotlin.H0.f51801a;
        }

        public final void c(String str) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "deviceRoleChangedLiveData : observe callback " + str);
            StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
            kotlin.jvm.internal.F.m(str);
            stageDashboardFragment.u2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class s extends Lambda implements X2.l<kotlin.H0, kotlin.H0> {
        s() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(kotlin.H0 h02) {
            c(h02);
            return kotlin.H0.f51801a;
        }

        public final void c(kotlin.H0 h02) {
            int d12;
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment micConnectInfoLiveData observe: wirelessMicInfo = " + partyBoxDevice.v1() + " micConnectStatus = " + partyBoxDevice.d1() + " deviceMid = " + k12.o());
                WirelessMicInfo v12 = partyBoxDevice.v1();
                if (v12 != null) {
                    d12 = v12.m();
                } else {
                    d12 = partyBoxDevice.d1();
                }
                stageDashboardFragment.w2(d12, partyBoxDevice.v1(), k12.o());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class t extends Lambda implements X2.l<Pair<? extends Boolean, ? extends String>, kotlin.H0> {
        t() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Pair<? extends Boolean, ? extends String> pair) {
            c(pair);
            return kotlin.H0.f51801a;
        }

        public final void c(Pair<Boolean, String> pair) {
            boolean booleanValue = pair.a().booleanValue();
            pair.b();
            com.harman.log.f.a(StageDashboardFragment.TAG, "BLE_LOG otaLiveData observer called and otaAvailable : " + booleanValue);
            StageDashboardFragment.R0(StageDashboardFragment.this, booleanValue, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class u extends Lambda implements X2.l<Pair<? extends Boolean, ? extends String>, kotlin.H0> {
        u() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Pair<? extends Boolean, ? extends String> pair) {
            c(pair);
            return kotlin.H0.f51801a;
        }

        public final void c(Pair<Boolean, String> pair) {
            boolean booleanValue = pair.a().booleanValue();
            pair.b();
            com.harman.log.f.a(StageDashboardFragment.TAG, "BLE_LOG micOtaLiveData observer called and micOtaLiveData : " + booleanValue);
            StageDashboardFragment.R0(StageDashboardFragment.this, false, booleanValue, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.jvm.internal.U({"SMAP\nStageDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageDashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment$initObserver$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1876:1\n1#2:1877\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class v extends Lambda implements X2.l<kotlin.H0, kotlin.H0> {
        v() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(kotlin.H0 h02) {
            c(h02);
            return kotlin.H0.f51801a;
        }

        public final void c(kotlin.H0 h02) {
            com.harman.log.f.a(StageDashboardFragment.TAG, "StageDashboardFragment BLE_LOG eqLiveData : observe callback ");
            HmDevice k12 = StageDashboardFragment.this.n1().k1();
            if (k12 != null) {
                StageDashboardFragment.this.r1().Z(k12, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$onBannerInAPlayTogetherPartyClicked$1", f = "StageDashboardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class w extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43150I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyBoxDevice f43152K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(PartyBoxDevice partyBoxDevice, kotlin.coroutines.c<? super w> cVar) {
            super(2, cVar);
            this.f43152K = partyBoxDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43150I == 0) {
                kotlin.W.n(obj);
                StageDashboardFragment.this.k1().x(DashboardBannerViewModel.EnumBannerStyle.HOW_TO_SWITCH_TO_STEREO);
                StageDashboardFragment.this.k1().w(this.f43152K);
                StageDashboardFragment stageDashboardFragment = StageDashboardFragment.this;
                stageDashboardFragment.V1(stageDashboardFragment.q1());
                return kotlin.H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((w) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new w(this.f43152K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment", f = "StageDashboardFragment.kt", i = {}, l = {1784}, m = "onUngroupBtnClick", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class x extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f43153H;

        /* renamed from: J, reason: collision with root package name */
        int f43155J;

        x(kotlin.coroutines.c<? super x> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f43153H = obj;
            this.f43155J |= Integer.MIN_VALUE;
            return StageDashboardFragment.this.onUngroupBtnClick(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$onUngroupBtnClick$result$1$1", f = "StageDashboardFragment.kt", i = {}, l = {1785}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class y extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43156I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f43157J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f43158K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(HmDevice hmDevice, HmDevice hmDevice2, kotlin.coroutines.c<? super y> cVar) {
            super(2, cVar);
            this.f43157J = hmDevice;
            this.f43158K = hmDevice2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43156I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                HmDevice hmDevice = this.f43157J;
                HmDevice hmDevice2 = this.f43158K;
                this.f43156I = 1;
                obj = aVar.o(hmDevice, hmDevice2, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((y) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new y(this.f43157J, this.f43158K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$onViewCreated$1", f = "StageDashboardFragment.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class z extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43159I;

        z(kotlin.coroutines.c<? super z> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43159I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                StageDashboardFragment.this.W0();
                this.f43159I = 1;
                if (C2269d0.b(com.harman.jbl.partybox.ui.ota.business.a.f44562c, this) == l4) {
                    return l4;
                }
            }
            StageDashboardFragment.this.V0();
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((z) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new z(cVar);
        }
    }

    public StageDashboardFragment() {
        super(j.i.f41435R0);
        kotlin.A a4;
        this.f43075Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, C1970b.f43124N);
        this.f43076R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43077S0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(E0.class), new X2.a<androidx.lifecycle.p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.p0 n() {
                androidx.lifecycle.p0 viewModelStore = ((androidx.lifecycle.q0) X2.a.this.n()).getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                kotlin.jvm.internal.F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        final X2.a<Fragment> aVar2 = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43078T0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.equalizer.e.class), new X2.a<androidx.lifecycle.p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.p0 n() {
                androidx.lifecycle.p0 viewModelStore = ((androidx.lifecycle.q0) X2.a.this.n()).getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                kotlin.jvm.internal.F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        final X2.a<Fragment> aVar3 = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43079U0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.equalizer.a.class), new X2.a<androidx.lifecycle.p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.p0 n() {
                androidx.lifecycle.p0 viewModelStore = ((androidx.lifecycle.q0) X2.a.this.n()).getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                kotlin.jvm.internal.F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f43089e1 = new C1972d();
        final X2.a<Fragment> aVar4 = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43090f1 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(DashboardBannerViewModel.class), new X2.a<androidx.lifecycle.p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$11
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.p0 n() {
                androidx.lifecycle.p0 viewModelStore = ((androidx.lifecycle.q0) X2.a.this.n()).getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$special$$inlined$viewModels$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                kotlin.jvm.internal.F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        a4 = kotlin.C.a(new A());
        this.f43091g1 = a4;
        this.f43092h1 = new d.c(new C1973e());
    }

    private final void A1() {
        com.harman.log.f.a(TAG, "BLE_LOG create ListShow");
        com.harman.log.f.a(TAG, "initLightShowCard isPartyBox320");
        j1().f39555Q.setVisibility(0);
        j1().f39558T.f38458F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.B1(StageDashboardFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2(PartyBoxDevice partyBoxDevice) {
        boolean M12 = M1();
        boolean N12 = N1();
        com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
        boolean l4 = d4.l(partyBoxDevice);
        com.harman.log.f.a(TAG, "updateStereoDeviceMissingLayout() >>> isOffline[" + M12 + "] isStandby[" + N12 + "] hadGroupID[" + l4 + "]");
        if (!M12 && !N12 && l4) {
            boolean o4 = d4.o(partyBoxDevice);
            com.harman.log.f.a(TAG, "updateStereoDeviceMissingLayout() >>> twsConnect[" + o4);
            if (!o4 && !com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p(partyBoxDevice) && !d4.r(partyBoxDevice)) {
                i2(partyBoxDevice);
                return;
            } else {
                g1();
                return;
            }
        }
        g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (!this$0.M1() && !this$0.N1()) {
            androidx.navigation.I i4 = z0.i();
            kotlin.jvm.internal.F.o(i4, "actionToLightShowControlDialogFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, i4);
        }
    }

    private final void B2(C1890j3 c1890j3, @androidx.annotation.D int i4) {
        View findViewById = j1().f39559U.findViewById(i4);
        C1868f1 j12 = j1();
        kotlin.jvm.internal.F.o(j12, "<get-binding>(...)");
        S1(j12, j.h.Lf);
        c1890j3.d().setId(j.h.Lf);
        if (findViewById == null) {
            j1().f39559U.addView(c1890j3.d(), Y0());
            return;
        }
        int indexOfChild = j1().f39559U.indexOfChild(findViewById);
        if (indexOfChild < 0) {
            j1().f39559U.addView(c1890j3.d(), Y0());
        } else {
            j1().f39559U.addView(c1890j3.d(), indexOfChild + 1, Y0());
        }
    }

    private final void C1() {
        com.harman.log.f.a(TAG, "BLE_LOG create StageMusicControlFragment");
        this.f43080V0 = new StageMusicControlFragment();
        androidx.fragment.app.F q4 = getParentFragmentManager().q();
        int i4 = j.h.nb;
        StageMusicControlFragment stageMusicControlFragment = this.f43080V0;
        kotlin.jvm.internal.F.m(stageMusicControlFragment);
        q4.C(i4, stageMusicControlFragment).r();
    }

    private final void C2(B3 b32, @androidx.annotation.D int i4) {
        View findViewById = j1().f39559U.findViewById(i4);
        C1868f1 j12 = j1();
        kotlin.jvm.internal.F.o(j12, "<get-binding>(...)");
        S1(j12, j.h.Mf);
        b32.d().setId(j.h.Mf);
        if (findViewById == null) {
            j1().f39559U.addView(b32.d(), Y0());
            return;
        }
        int indexOfChild = j1().f39559U.indexOfChild(findViewById);
        if (indexOfChild < 0) {
            j1().f39559U.addView(b32.d(), Y0());
        } else {
            j1().f39559U.addView(b32.d(), indexOfChild + 1, Y0());
        }
    }

    private final void D1() {
        n1().F1().k(getViewLifecycleOwner(), new C(new n()));
        s1().f0().k(getViewLifecycleOwner(), new C(new o()));
        n1().Y0().k(getViewLifecycleOwner(), new C(new p()));
        s1().e0().k(getViewLifecycleOwner(), new C(new q()));
        n1().e1().k(getViewLifecycleOwner(), new C(new r()));
        n1().l1().k(getViewLifecycleOwner(), new C(new s()));
        n1().p1().k(getViewLifecycleOwner(), new C(new t()));
        n1().m1().k(getViewLifecycleOwner(), new C(new u()));
        n1().f1().k(getViewLifecycleOwner(), new C(new v()));
        r1().c0().k(getViewLifecycleOwner(), new C(new C1975g()));
        r1().e0().k(getViewLifecycleOwner(), new C(new h()));
        s1().n0().k(getViewLifecycleOwner(), new C(i.f43136F));
        n1().z1().k(getViewLifecycleOwner(), new C(new j()));
        s1().m0().k(getViewLifecycleOwner(), new C(new k()));
        s1().k0().k(getViewLifecycleOwner(), new C(new l()));
        n1().s1().k(getViewLifecycleOwner(), new C(new m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(PartyBoxDevice partyBoxDevice) {
        String str;
        C1890j3 c4 = C1890j3.c(LayoutInflater.from(getContext()));
        kotlin.jvm.internal.F.o(c4, "inflate(...)");
        String n4 = partyBoxDevice.n();
        TWSInfo M3 = partyBoxDevice.M();
        if (M3 != null) {
            str = M3.a();
        } else {
            str = null;
        }
        com.harman.log.f.a(TAG, "updateStereoGroupLayout() >>> MAC[" + n4 + "] group.id[" + str + "]");
        if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.s(partyBoxDevice)) {
            b1(c4, partyBoxDevice);
        } else {
            Z0(c4, partyBoxDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(final StageDashboardFragment this$0, final C1868f1 this_apply, ViewStub viewStub, View view) {
        RelativeLayout d4;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(this_apply, "$this_apply");
        C1885i3 a4 = C1885i3.a(view);
        this$0.f43082X0 = a4;
        if (a4 != null) {
            kotlin.jvm.internal.F.m(a4);
            a4.f39694F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StageDashboardFragment.F1(C1868f1.this, this$0, view2);
                }
            });
            C1885i3 c1885i3 = this$0.f43082X0;
            if (c1885i3 != null && (d4 = c1885i3.d()) != null) {
                d4.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.r0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        StageDashboardFragment.G1(StageDashboardFragment.this, view2);
                    }
                });
                if (!this$0.M1() && !this$0.N1()) {
                    kotlin.jvm.internal.F.m(d4);
                    this$0.r2(d4);
                } else {
                    kotlin.jvm.internal.F.m(d4);
                    this$0.P1(d4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2(final com.harman.sdk.device.PartyBoxDevice r14) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment.E2(com.harman.sdk.device.PartyBoxDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(C1868f1 this_apply, StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this_apply, "$this_apply");
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this_apply.f39567c0.setVisibility(8);
        this$0.n1().a3(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(StageDashboardFragment this$0, PartyBoxDevice mainDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        if (!this$0.M1() && !this$0.N1()) {
            com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
            if (d4.o(mainDevice) && !d4.l(mainDevice)) {
                z0.b k4 = z0.k(mainDevice, d4.h(mainDevice), EnumStereoType.TWS.g(), EnumStereoChannelFromPage.DASHBOARD.g());
                kotlin.jvm.internal.F.o(k4, "actionToStereoChannelFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this$0, k4);
            } else {
                C2005p.c i4 = C2005p.i(mainDevice, EnumStereoType.TWS.g());
                kotlin.jvm.internal.F.o(i4, "actionToStereoScanFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this$0, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (!this$0.M1() && !this$0.N1()) {
            Pair<Boolean, String> f4 = this$0.n1().p1().f();
            if (f4 != null && f4.e().booleanValue()) {
                androidx.navigation.I d4 = z0.d();
                kotlin.jvm.internal.F.o(d4, "actionDashboardFragmentToOtaWhatsNew(...)");
                com.harman.jbl.partybox.utils.q.f(this$0, d4);
                return;
            }
            Pair<Boolean, String> f5 = this$0.n1().m1().f();
            if (f5 != null && f5.e().booleanValue()) {
                androidx.navigation.I c4 = z0.c();
                kotlin.jvm.internal.F.o(c4, "actionDashboardFragmentToMicOtaWhatsNew(...)");
                com.harman.jbl.partybox.utils.q.f(this$0, c4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "BLE_LOG topPanelSettingContainer clicked");
        if (!this$0.M1() && !this$0.N1()) {
            androidx.navigation.I a4 = z0.a();
            kotlin.jvm.internal.F.o(a4, "actionDashboardFragmentT…ttonSettingsFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(StageDashboardFragment this$0, View view) {
        String q4;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "BLE_LOG karaokeLayout clicked");
        if (!this$0.M1() && !this$0.N1()) {
            HmDevice k12 = this$0.n1().k1();
            if (k12 != null && (q4 = k12.q()) != null) {
                com.harman.jbl.partybox.constants.a aVar = com.harman.jbl.partybox.constants.a.f38346a;
                com.harman.jbl.partybox.constants.a.f38353d0 = q4;
            }
            androidx.navigation.I b4 = z0.b();
            kotlin.jvm.internal.F.o(b4, "actionDashboardFragmentToKaraokeFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "StageDashboardFragment on back click");
        this$0.Q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (!this$0.M1() && !this$0.N1()) {
            androidx.navigation.I a4 = z0.a();
            kotlin.jvm.internal.F.o(a4, "actionDashboardFragmentT…ttonSettingsFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "BLE_LOG turnOffButton clicked");
        if (this$0.M1() && !this$0.N1()) {
            return;
        }
        if (com.harman.jbl.partybox.utils.g.c(1000L)) {
            com.harman.log.f.a(TAG, "BLE_LOG turnOffButton fast clicked");
            return;
        }
        if (this$0.N1()) {
            this$0.o2();
        } else if (!this$0.M1()) {
            androidx.navigation.I e4 = z0.e();
            kotlin.jvm.internal.F.o(e4, "actionDashboardFragmentToPowerOffFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, e4);
        }
    }

    private final boolean M1() {
        PartyBoxDevice partyBoxDevice;
        HmDevice k12 = n1().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        boolean z3 = true;
        if (partyBoxDevice == null) {
            com.harman.log.f.a(TAG, "isDeviceOffline() >>> missing main device or not a PartyBox type");
            return true;
        }
        if ((partyBoxDevice.O() && partyBoxDevice.R()) || partyBoxDevice.F1()) {
            z3 = false;
        }
        com.harman.log.f.a(TAG, "isDeviceOffline() >>> MAC[" + partyBoxDevice.n() + "] Classic BT.connected[" + partyBoxDevice.O() + "] BLE.connected[" + partyBoxDevice.R() + "] standby[" + partyBoxDevice.F1() + "]");
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N1() {
        HmDevice k12 = n1().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment isDeviceStandby :" + partyBoxDevice.F1());
            return partyBoxDevice.F1();
        }
        com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment isDeviceStandby :false");
        return false;
    }

    private final boolean O1(PartyBoxDevice partyBoxDevice) {
        if (partyBoxDevice.l1().get("Device_Battery") == null) {
            return true;
        }
        return false;
    }

    private final void P1(View view) {
        view.setForeground(new ColorDrawable(view.getResources().getColor(j.d.f40746e1)));
    }

    private final UpdateEnum Q0(boolean z3, boolean z4) {
        TextView textView;
        TextView textView2;
        com.harman.log.f.a(TAG, "BLE_LOG changeUpdateViewVisible called and otaAvailable : " + z3 + ", micOtaAvailable = " + z4);
        if (!M1() && !N1()) {
            if (z3) {
                com.harman.log.f.a(TAG, "BLE_LOG changeUpdateViewVisible if (otaAvailable) called");
                if (n1().x1()) {
                    m2();
                }
                C1885i3 c1885i3 = this.f43082X0;
                if (c1885i3 != null && (textView2 = c1885i3.f39696H) != null) {
                    textView2.setText(j.m.X9);
                }
                j1().f39566b0.b(j.m.O8);
                return UpdateEnum.UPDATE_PARTY_BOX;
            }
            if (z4) {
                com.harman.log.f.a(TAG, "BLE_LOG changeUpdateViewVisible if (micOtaAvailable) called");
                if (n1().x1()) {
                    m2();
                }
                C1885i3 c1885i32 = this.f43082X0;
                if (c1885i32 != null && (textView = c1885i32.f39696H) != null) {
                    textView.setText(j.m.N3);
                }
                j1().f39566b0.b(j.m.N3);
                return UpdateEnum.UPDATE_WIRELESS_MIC;
            }
            com.harman.log.f.a(TAG, "BLE_LOG changeUpdateViewVisible else called");
            u1();
            return UpdateEnum.UPDATE_NONE;
        }
        com.harman.log.f.a(TAG, "BLE_LOG changeUpdateViewVisible isDeviceOffline() || isDeviceStandby() called  return");
        return UpdateEnum.UPDATE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        com.harman.log.f.a(TAG, "StageDashboardFragment updateUIPage:UiPage.PRODUCT_LIST>>>3");
        n1().x2();
        requireActivity().finish();
    }

    static /* synthetic */ UpdateEnum R0(StageDashboardFragment stageDashboardFragment, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            Pair<Boolean, String> f4 = stageDashboardFragment.n1().p1().f();
            if (f4 != null) {
                z3 = f4.e().booleanValue();
            } else {
                z3 = false;
            }
        }
        if ((i4 & 2) != 0) {
            Pair<Boolean, String> f5 = stageDashboardFragment.n1().m1().f();
            if (f5 != null) {
                z4 = f5.e().booleanValue();
            } else {
                z4 = false;
            }
        }
        return stageDashboardFragment.Q0(z3, z4);
    }

    private final void R1() {
        int i4;
        C1868f1 j12 = j1();
        int childCount = j12.f39554P.getChildCount() - 2;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = j12.f39554P.getChildAt(i6);
            boolean z3 = childAt instanceof ForegroundMaskLayout;
            com.harman.log.f.a(TAG, "removeMaskIfHas>>> layoutCardContainer.getChildAt index = " + i6 + ", view = " + childAt.getClass() + ", child is ForegroundMaskLayout = " + z3);
            if (z3) {
                ((ForegroundMaskLayout) childAt).b();
            }
        }
        ConstraintLayout d4 = j12.f39552N.d();
        if (M1()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        d4.setVisibility(i4);
        HmCustomFontTextView hmCustomFontTextView = j12.f39563Y;
        if (!M1() && !N1()) {
            i5 = 8;
        }
        hmCustomFontTextView.setVisibility(i5);
        j1().f39548J.f38653L.setEnabled(!M1());
    }

    private final void S0(String str) {
        final ActivityC0889g activity;
        b.a aVar = q2.b.f57366d;
        RatingGuideType b4 = aVar.a().b(str);
        aVar.a().i(str, C2410a.f57640c);
        com.harman.log.f.a(TAG, "ratingGuideType: " + b4);
        if (b4 != RatingGuideType.RATING_NONE && (activity = getActivity()) != null) {
            final com.google.android.play.core.review.b a4 = com.google.android.play.core.review.c.a(activity);
            kotlin.jvm.internal.F.o(a4, "create(...)");
            a4.b().e(new InterfaceC1764e() { // from class: com.harman.jbl.partybox.ui.dashboard.o0
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    StageDashboardFragment.T0(com.google.android.play.core.review.b.this, activity, abstractC1770k);
                }
            });
        }
    }

    private final void S1(C1868f1 c1868f1, int i4) {
        View findViewById = c1868f1.f39559U.findViewById(i4);
        if (findViewById == null) {
            return;
        }
        c1868f1.f39559U.removeView(findViewById);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(com.google.android.play.core.review.b reviewManager, ActivityC0889g context, AbstractC1770k task) {
        kotlin.jvm.internal.F.p(reviewManager, "$reviewManager");
        kotlin.jvm.internal.F.p(context, "$context");
        kotlin.jvm.internal.F.p(task, "task");
        if (task.v()) {
            com.harman.log.f.a(TAG, "launchReviewFlow");
            reviewManager.a(context, (com.google.android.play.core.review.a) task.r()).e(new InterfaceC1764e() { // from class: com.harman.jbl.partybox.ui.dashboard.s0
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    StageDashboardFragment.U0(abstractC1770k);
                }
            });
        }
    }

    private final void T1() {
        com.harman.log.f.a(TAG, "BLE_LOG retrieveInfoOnceConnected called");
        if (n1().k1() != null) {
            n1().P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(AbstractC1770k it) {
        kotlin.jvm.internal.F.p(it, "it");
        q2.b.f57366d.a().j(UserAction.ACTION_RATE_US);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void U1(List<? extends HmDevice> list) {
        MainActivityNav mainActivityNav;
        int i4;
        StereoEffectDialog stereoEffectDialog;
        HmDevice hmDevice;
        Dialog dialog;
        ActivityC0889g activity = getActivity();
        T t3 = 0;
        if (activity instanceof MainActivityNav) {
            mainActivityNav = (MainActivityNav) activity;
        } else {
            mainActivityNav = null;
        }
        if (mainActivityNav != null) {
            i4 = mainActivityNav.Y0();
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect pageIndex=" + i4);
            return;
        }
        HmDevice k12 = n1().k1();
        if (k12 == null) {
            com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect currentDevice is null");
            return;
        }
        if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(k12)) {
            com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect currentDevice is tws group");
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.F.g(((HmDevice) next).n(), k12.n())) {
                t3 = next;
                break;
            }
        }
        objectRef.f52301E = t3;
        com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect  currentDeviceInList" + t3);
        if (objectRef.f52301E == 0) {
            com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect currentDeviceInList is tws group");
            return;
        }
        if (!M1() && !N1()) {
            if (list.size() < 2) {
                com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect " + list.size());
                return;
            }
            StereoEffectDialog stereoEffectDialog2 = this.f43088d1;
            if ((stereoEffectDialog2 != null && stereoEffectDialog2.isAdded()) || ((stereoEffectDialog = this.f43088d1) != null && (dialog = stereoEffectDialog.getDialog()) != null && true == dialog.isShowing())) {
                com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect return");
                return;
            }
            String str = list.get(0).n() + " " + list.get(1).n();
            if (n1().N1()) {
                com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect  has pop:true,macs:" + str);
                return;
            }
            if (kotlin.jvm.internal.F.g(list.get(0).n(), k12.n())) {
                hmDevice = list.get(1);
            } else {
                hmDevice = list.get(0);
            }
            HmDevice hmDevice2 = hmDevice;
            this.f43088d1 = new StereoEffectDialog(hmDevice2.q(), hmDevice2.o(), new B(objectRef));
            com.harman.log.f.a(TAG, "StageDashboardFragment,Stereo Effect dialog shown");
            StereoEffectDialog stereoEffectDialog3 = this.f43088d1;
            if (stereoEffectDialog3 != null) {
                stereoEffectDialog3.show(getChildFragmentManager(), StereoEffectDialog.TAG);
            }
            n1().q3();
            return;
        }
        com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Effect currentDevice is isDeviceOffline or standby");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0() {
        HmDevice k12;
        if (!M1() && !N1() && (k12 = n1().k1()) != null) {
            s1().b0(k12, n1().d1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1(DialogFragment dialogFragment) {
        if (!dialogFragment.isAdded()) {
            dialogFragment.show(getChildFragmentManager(), (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0() {
        Dialog dialog;
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        boolean p4 = aVar.p();
        com.harman.log.f.a(TAG, "StageDashboardFragment checkOnBoardingShownStatus shown:" + p4 + " ");
        if (p4) {
            return;
        }
        OnBoardingTutorialFragment onBoardingTutorialFragment = this.f43087c1;
        if (onBoardingTutorialFragment == null || !onBoardingTutorialFragment.isAdded()) {
            OnBoardingTutorialFragment onBoardingTutorialFragment2 = this.f43087c1;
            if (onBoardingTutorialFragment2 != null && (dialog = onBoardingTutorialFragment2.getDialog()) != null && true == dialog.isShowing()) {
                return;
            }
            aVar.H();
            OnBoardingTutorialFragment onBoardingTutorialFragment3 = new OnBoardingTutorialFragment();
            this.f43087c1 = onBoardingTutorialFragment3;
            onBoardingTutorialFragment3.show(getChildFragmentManager(), OnBoardingTutorialFragment.TAG);
        }
    }

    private final void W1() {
        C1868f1 j12 = j1();
        j12.f39555Q.setVisibility(0);
        j12.f39550L.f39722F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.X1(StageDashboardFragment.this, view);
            }
        });
    }

    private final void X0() {
        try {
            this.f43080V0 = null;
            this.f43081W0 = null;
        } catch (Exception e4) {
            com.harman.log.f.a(TAG, e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "StageDashboardFragment effectLabContainer on click");
        if (!this$0.M1() && !this$0.N1()) {
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) EffectLabActivity.class);
            ActivityC0889g activity = this$0.getActivity();
            if (activity != null) {
                activity.startActivity(intent);
            }
        }
    }

    private final LinearLayout.LayoutParams Y0() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) com.harman.jbl.partybox.ui.widget.w.f46160a.b(getContext(), 16.0f);
        return layoutParams;
    }

    private final void Y1(PartyBoxDevice partyBoxDevice) {
        int i4;
        MatchWidthCardView matchWidthCardView = j1().f39566b0;
        if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(partyBoxDevice)) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        matchWidthCardView.setVisibility(i4);
        matchWidthCardView.setCardOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.Z1(StageDashboardFragment.this, view);
            }
        });
    }

    private final void Z0(C1890j3 c1890j3, final PartyBoxDevice partyBoxDevice) {
        int i4;
        ConstraintLayout layoutStereoGroup = c1890j3.f39733M;
        kotlin.jvm.internal.F.o(layoutStereoGroup, "layoutStereoGroup");
        int i5 = 0;
        layoutStereoGroup.setVisibility(0);
        LinearLayout llGrouped = c1890j3.f39734N;
        kotlin.jvm.internal.F.o(llGrouped, "llGrouped");
        llGrouped.setVisibility(8);
        HmCustomFontTextView tvUngroup = j1().f39573i0;
        kotlin.jvm.internal.F.o(tvUngroup, "tvUngroup");
        tvUngroup.setVisibility(8);
        j1().f39573i0.setOnClickListener(null);
        boolean M12 = M1();
        boolean N12 = N1();
        boolean f4 = com.harman.jbl.partybox.ui.party.b.f44881a.f(partyBoxDevice);
        if (!M12 && !N12 && !f4) {
            com.harman.log.f.d(TAG, "decoSingleState() >>> main device[" + partyBoxDevice.n() + "] was in normal state");
            ConstraintLayout layoutStereoGroup2 = c1890j3.f39733M;
            kotlin.jvm.internal.F.o(layoutStereoGroup2, "layoutStereoGroup");
            r2(layoutStereoGroup2);
            c1890j3.f39733M.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.a1(StageDashboardFragment.this, partyBoxDevice, view);
                }
            });
        } else {
            com.harman.log.f.d(TAG, "decoSingleState() >>> main device[" + partyBoxDevice.n() + "] was in abnormal state: isOffline[" + M12 + "] isStandby[" + N12 + "] isDaisyChain[" + f4 + "]");
            ConstraintLayout layoutStereoGroup3 = c1890j3.f39733M;
            kotlin.jvm.internal.F.o(layoutStereoGroup3, "layoutStereoGroup");
            P1(layoutStereoGroup3);
            c1890j3.f39733M.setOnClickListener(null);
        }
        boolean V3 = s1().V(partyBoxDevice);
        View icNewDeviceRedDot = c1890j3.f39730J;
        kotlin.jvm.internal.F.o(icNewDeviceRedDot, "icNewDeviceRedDot");
        if (!V3) {
            i5 = 8;
        }
        icNewDeviceRedDot.setVisibility(i5);
        if (V3) {
            i4 = j.h.d9;
        } else {
            i4 = j.h.ig;
        }
        B2(c1890j3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (!this$0.M1() && !this$0.N1()) {
            androidx.navigation.I f4 = z0.f();
            kotlin.jvm.internal.F.o(f4, "actionDashboardFragmentToSupportFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(StageDashboardFragment this$0, PartyBoxDevice mainDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        this$0.n1().q3();
        z0.c l4 = z0.l(mainDevice, EnumStereoType.STEREO.g());
        kotlin.jvm.internal.F.o(l4, "actionToStereoScanFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        int i4;
        int i5;
        C1868f1 j12 = j1();
        int i6 = 0;
        if (!M1() && !N1()) {
            j12.f39554P.setOnClickListener(null);
        } else {
            int childCount = j12.f39554P.getChildCount() - 2;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = j12.f39554P.getChildAt(i7);
                boolean z3 = childAt instanceof ForegroundMaskLayout;
                com.harman.log.f.a(TAG, "setupOfflineView>>> layoutCardContainer.getChildAt index = " + i7 + ", view = " + childAt.getClass() + ", child is ForegroundMaskLayout = " + z3);
                if (z3) {
                    ((ForegroundMaskLayout) childAt).a();
                }
            }
            ViewGroup.LayoutParams layoutParams = j12.f39549K.getLayoutParams();
            if (layoutParams != null) {
                kotlin.jvm.internal.F.m(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (M1() && !N1()) {
                    i4 = com.harman.jbl.partybox.utils.j.a(getContext(), 70.0f);
                } else {
                    i4 = 0;
                }
                layoutParams2.setMargins(0, i4, 0, 0);
            }
            j12.f39554P.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.Y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.b2(view);
                }
            });
        }
        ConstraintLayout d4 = j12.f39552N.d();
        if (M1()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        d4.setVisibility(i5);
        d4.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.c2(StageDashboardFragment.this, view);
            }
        });
        HmCustomFontTextView hmCustomFontTextView = j12.f39563Y;
        if (!M1() && !N1()) {
            i6 = 8;
        }
        hmCustomFontTextView.setVisibility(i6);
        hmCustomFontTextView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.d2(StageDashboardFragment.this, view);
            }
        });
        j12.f39551M.d();
    }

    private final void b1(C1890j3 c1890j3, final PartyBoxDevice partyBoxDevice) {
        com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
        final HmDevice g4 = d4.g(partyBoxDevice);
        ConstraintLayout layoutStereoGroup = c1890j3.f39733M;
        kotlin.jvm.internal.F.o(layoutStereoGroup, "layoutStereoGroup");
        layoutStereoGroup.setVisibility(8);
        LinearLayout llGrouped = c1890j3.f39734N;
        kotlin.jvm.internal.F.o(llGrouped, "llGrouped");
        llGrouped.setVisibility(0);
        boolean z3 = !d4.o(partyBoxDevice);
        boolean M12 = M1();
        boolean N12 = N1();
        boolean f4 = com.harman.jbl.partybox.ui.party.b.f44881a.f(partyBoxDevice);
        boolean p4 = com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p(partyBoxDevice);
        if (!z3 && !M12 && !N12 && !f4 && !p4) {
            com.harman.log.f.d(TAG, "decoStereoState() >>> main device[" + partyBoxDevice.n() + "] was in normal state");
            LinearLayout llGrouped2 = c1890j3.f39734N;
            kotlin.jvm.internal.F.o(llGrouped2, "llGrouped");
            r2(llGrouped2);
            c1890j3.f39726F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.c1(StageDashboardFragment.this, partyBoxDevice, g4, view);
                }
            });
            c1890j3.f39728H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.d1(StageDashboardFragment.this, partyBoxDevice, g4, view);
                }
            });
            c1890j3.f39727G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.e1(StageDashboardFragment.this, view);
                }
            });
        } else {
            com.harman.log.f.d(TAG, "decoStereoState() >>> main device[" + partyBoxDevice.n() + "] was in abnormal state: isMissing[" + z3 + "] isOffline[" + M12 + "] isStandby[" + N12 + "] isDaisyChain[" + f4 + "] isAuracastOn[" + p4 + "]");
            LinearLayout llGrouped3 = c1890j3.f39734N;
            kotlin.jvm.internal.F.o(llGrouped3, "llGrouped");
            P1(llGrouped3);
            c1890j3.f39726F.setOnClickListener(null);
            c1890j3.f39728H.setOnClickListener(null);
            c1890j3.f39727G.setOnClickListener(null);
        }
        if (!M12 && !N12) {
            HmCustomFontTextView tvUngroup = j1().f39573i0;
            kotlin.jvm.internal.F.o(tvUngroup, "tvUngroup");
            tvUngroup.setVisibility(0);
            j1().f39573i0.setText(getResources().getText(j.m.Ua));
            j1().f39573i0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.f1(StageDashboardFragment.this, partyBoxDevice, g4, view);
                }
            });
        } else {
            HmCustomFontTextView tvUngroup2 = j1().f39573i0;
            kotlin.jvm.internal.F.o(tvUngroup2, "tvUngroup");
            tvUngroup2.setVisibility(8);
        }
        B2(c1890j3, j.h.ig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(View view) {
        com.harman.log.f.a(TAG, "StageDashboardFragment setupOfflineView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(StageDashboardFragment this$0, PartyBoxDevice mainDevice, HmDevice hmDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        z0.d m4 = z0.m(mainDevice, hmDevice, EnumStereoType.STEREO.g(), EnumStereoChannelFromPage.GROUP_SETTING.g());
        kotlin.jvm.internal.F.o(m4, "toStereoChannelFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, m4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        z0.a c4 = z0.g("").c(0);
        kotlin.jvm.internal.F.o(c4, "setIsFromProductList(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(StageDashboardFragment this$0, PartyBoxDevice mainDevice, HmDevice hmDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        z0.e n4 = z0.n(mainDevice, hmDevice, EnumStereoRenameFromPage.GROUP_SETTING.i());
        kotlin.jvm.internal.F.o(n4, "toStereoRenameFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, n4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(StageDashboardFragment this$0, View view) {
        String n4;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        HmDevice g02 = this$0.s1().g0();
        if (g02 != null && (n4 = g02.n()) != null) {
            this$0.k2(n4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        androidx.navigation.I j4 = z0.j();
        kotlin.jvm.internal.F.o(j4, "actionToSpeakerInfoGroupFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(final PartyBoxDevice partyBoxDevice) {
        int i4;
        com.harman.log.f.a(TAG, "setupToneShifterCard called: isSupportToneShifter = " + partyBoxDevice.N1() + ", toneShifterStatus = " + partyBoxDevice.q1());
        C1868f1 j12 = j1();
        ConstraintLayout constraintLayout = j12.f39568d0;
        if (partyBoxDevice.N1()) {
            if (partyBoxDevice.q1() == 0) {
                j12.f39570f0.setTextColor(constraintLayout.getResources().getColor(j.d.f40749f1));
                j12.f39570f0.setText(getString(j.m.e5));
            } else {
                j12.f39570f0.setText(getString(j.m.Y4, String.valueOf(partyBoxDevice.q1())));
                j12.f39570f0.setTextColor(constraintLayout.getResources().getColor(j.d.f40685C0));
            }
            j12.f39569e0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.f2(StageDashboardFragment.this, partyBoxDevice, view);
                }
            });
            i4 = 0;
        } else {
            i4 = 8;
        }
        constraintLayout.setVisibility(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(StageDashboardFragment this$0, PartyBoxDevice mainDevice, HmDevice hmDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        C2323l.f(androidx.lifecycle.F.a(this$0), C2322k0.e(), null, new C1971c(mainDevice, hmDevice, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(StageDashboardFragment this$0, PartyBoxDevice mainDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        Context requireContext = this$0.requireContext();
        kotlin.jvm.internal.F.o(requireContext, "requireContext(...)");
        new ToneShifterDialog(requireContext, mainDevice).show(this$0.getChildFragmentManager(), ToneShifterDialog.TAG);
    }

    private final void g1() {
        ConstraintLayout d4 = j1().f39553O.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        d4.setVisibility(8);
        j1().f39553O.d().setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(final PartyBoxDevice partyBoxDevice) {
        int i4;
        int i5;
        com.harman.log.f.a(TAG, "setupVolumeBoostCard called: isSupportVolumeBoost = " + partyBoxDevice.Q1() + ", volumeBoostStatus = " + partyBoxDevice.u1());
        final C1868f1 j12 = j1();
        ConstraintLayout constraintLayout = j12.f39574j0;
        if (partyBoxDevice.Q1()) {
            ImageView imageView = j12.f39576l0;
            if (partyBoxDevice.u1()) {
                i5 = j.f.i4;
            } else {
                i5 = j.f.h4;
            }
            imageView.setImageResource(i5);
            j12.f39576l0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.h2(StageDashboardFragment.this, partyBoxDevice, j12, view);
                }
            });
            i4 = 0;
        } else {
            i4 = 8;
        }
        constraintLayout.setVisibility(i4);
        MusicControlSettings e12 = partyBoxDevice.e1();
        if (e12 == null) {
            com.harman.log.f.g(TAG, "refreshMusicControlModel() >>> missing musicControlSettings");
        } else if (partyBoxDevice.Q1() && partyBoxDevice.u1() && e12.g() == 32) {
            j12.f39575k0.a();
        } else {
            j12.f39575k0.b();
        }
    }

    private final CharSequence h1(PartyBoxDevice partyBoxDevice, String str) {
        Byte b4;
        OneTouchMusicButtonSettings D3;
        OneTouchMusicButtonSettings D4;
        OneTouchMusicButtonSettings D5;
        if (partyBoxDevice != null && (D5 = partyBoxDevice.D()) != null) {
            if (D5.b() == 1) {
                if (D5.a() == 1) {
                    kotlin.jvm.internal.W w3 = kotlin.jvm.internal.W.f52310a;
                    String string = getResources().getString(j.m.f41834w1);
                    kotlin.jvm.internal.F.o(string, "getString(...)");
                    str = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                    kotlin.jvm.internal.F.o(str, "format(...)");
                } else if (D5.a() == 2) {
                    kotlin.jvm.internal.W w4 = kotlin.jvm.internal.W.f52310a;
                    String string2 = getResources().getString(j.m.f41786m0);
                    kotlin.jvm.internal.F.o(string2, "getString(...)");
                    str = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
                    kotlin.jvm.internal.F.o(str, "format(...)");
                } else {
                    kotlin.jvm.internal.W w5 = kotlin.jvm.internal.W.f52310a;
                    String string3 = getResources().getString(j.m.f41738c2);
                    kotlin.jvm.internal.F.o(string3, "getString(...)");
                    str = String.format(string3, Arrays.copyOf(new Object[0], 0));
                    kotlin.jvm.internal.F.o(str, "format(...)");
                }
            } else if (D5.a() == 1) {
                kotlin.jvm.internal.W w6 = kotlin.jvm.internal.W.f52310a;
                String string4 = getResources().getString(j.m.f41838x1);
                kotlin.jvm.internal.F.o(string4, "getString(...)");
                str = String.format(string4, Arrays.copyOf(new Object[]{str}, 1));
                kotlin.jvm.internal.F.o(str, "format(...)");
            } else if (D5.a() == 2) {
                kotlin.jvm.internal.W w7 = kotlin.jvm.internal.W.f52310a;
                String string5 = getResources().getString(j.m.f41791n0);
                kotlin.jvm.internal.F.o(string5, "getString(...)");
                str = String.format(string5, Arrays.copyOf(new Object[]{str}, 1));
                kotlin.jvm.internal.F.o(str, "format(...)");
            } else {
                kotlin.jvm.internal.W w8 = kotlin.jvm.internal.W.f52310a;
                String string6 = getResources().getString(j.m.f41738c2);
                kotlin.jvm.internal.F.o(string6, "getString(...)");
                str = String.format(string6, Arrays.copyOf(new Object[0], 0));
                kotlin.jvm.internal.F.o(str, "format(...)");
            }
        }
        Byte b5 = null;
        if (partyBoxDevice != null && (D4 = partyBoxDevice.D()) != null) {
            b4 = Byte.valueOf(D4.b());
        } else {
            b4 = null;
        }
        if (partyBoxDevice != null && (D3 = partyBoxDevice.D()) != null) {
            b5 = Byte.valueOf(D3.a());
        }
        com.harman.log.f.a(TAG, "genOneTouchDesc() >>> return desc[" + ((Object) str) + "] oneTouchButtonSettings btn.id[" + b4 + "] action.id[" + b5 + "]");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(StageDashboardFragment this$0, PartyBoxDevice mainDevice, C1868f1 this_apply, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        kotlin.jvm.internal.F.p(this_apply, "$this_apply");
        if (!this$0.M1() && !this$0.N1()) {
            kotlin.jvm.internal.F.n(view, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) view;
            if (!mainDevice.u1()) {
                new VolumeBoostDialogFragment(new D(mainDevice, view, this$0)).show(this$0.getChildFragmentManager(), VolumeBoostDialogFragment.TAG);
                return;
            }
            mainDevice.O2(false);
            imageView.setImageResource(j.f.h4);
            this$0.s1().s0(mainDevice, mainDevice.u1());
            this_apply.f39575k0.b();
        }
    }

    static /* synthetic */ CharSequence i1(StageDashboardFragment stageDashboardFragment, PartyBoxDevice partyBoxDevice, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            HmDevice k12 = stageDashboardFragment.n1().k1();
            if (k12 instanceof PartyBoxDevice) {
                partyBoxDevice = (PartyBoxDevice) k12;
            } else {
                partyBoxDevice = null;
            }
        }
        return stageDashboardFragment.h1(partyBoxDevice, str);
    }

    private final void i2(final PartyBoxDevice partyBoxDevice) {
        ConstraintLayout d4 = j1().f39553O.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        d4.setVisibility(0);
        j1().f39553O.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.j2(StageDashboardFragment.this, partyBoxDevice, view);
            }
        });
    }

    private final void initView() {
        int d12;
        final C1868f1 j12 = j1();
        j12.f39567c0.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.harman.jbl.partybox.ui.dashboard.f0
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                StageDashboardFragment.E1(StageDashboardFragment.this, j12, viewStub, view);
            }
        });
        A3 a32 = j12.f39571g0;
        a32.f38462F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.H1(StageDashboardFragment.this, view);
            }
        });
        HmDevice k12 = n1().k1();
        if (k12 != null) {
            a32.f38463G.setImageResource(com.harman.sdk.utils.d.z(requireContext(), k12.q(), k12.o()));
        }
        ConstraintLayout constraintLayout = j12.f39560V.f38549F;
        HmDevice k13 = n1().k1();
        if (k13 != null) {
            kotlin.jvm.internal.F.n(k13, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k13;
            com.harman.log.f.a(TAG, "StageDashboardFragment initView wirelessMicInfo = " + partyBoxDevice.v1() + " micConnectStatus = " + partyBoxDevice.d1() + " deviceMid = " + k13.o());
            WirelessMicInfo v12 = partyBoxDevice.v1();
            if (v12 != null) {
                d12 = v12.m();
            } else {
                d12 = partyBoxDevice.d1();
            }
            w2(d12, partyBoxDevice.v1(), k13.o());
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.I1(StageDashboardFragment.this, view);
            }
        });
        j12.f39548J.f38647F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.J1(StageDashboardFragment.this, view);
            }
        });
        j12.f39565a0.setCardOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.K1(StageDashboardFragment.this, view);
            }
        });
        j12.f39548J.f38653L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.L1(StageDashboardFragment.this, view);
            }
        });
        HmDevice k14 = n1().k1();
        if (k14 != null) {
            s2(k14);
            u2(k14.n());
            v1((PartyBoxDevice) k14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1868f1 j1() {
        return (C1868f1) this.f43075Q0.a(this, f43074i1[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(StageDashboardFragment this$0, PartyBoxDevice mainDevice, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mainDevice, "$mainDevice");
        androidx.lifecycle.F.a(this$0).e(new E(mainDevice, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DashboardBannerViewModel k1() {
        return (DashboardBannerViewModel) this.f43090f1.getValue();
    }

    private final void k2(String str) {
        RemoveProductDialogFragment removeProductDialogFragment;
        Dialog dialog;
        Boolean bool;
        Dialog dialog2;
        RemoveProductDialogFragment removeProductDialogFragment2 = this.f43085a1;
        if ((removeProductDialogFragment2 != null && removeProductDialogFragment2.isAdded()) || ((removeProductDialogFragment = this.f43085a1) != null && (dialog = removeProductDialogFragment.getDialog()) != null && dialog.isShowing())) {
            RemoveProductDialogFragment removeProductDialogFragment3 = this.f43085a1;
            if (removeProductDialogFragment3 != null && (dialog2 = removeProductDialogFragment3.getDialog()) != null) {
                bool = Boolean.valueOf(dialog2.isShowing());
            } else {
                bool = null;
            }
            com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment showRemoveProductDialog :" + bool);
            return;
        }
        RemoveProductDialogFragment removeProductDialogFragment4 = new RemoveProductDialogFragment(new F(str, this));
        this.f43085a1 = removeProductDialogFragment4;
        removeProductDialogFragment4.show(getChildFragmentManager(), RemoveProductDialogFragment.class.getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        Context context;
        HmDevice k12 = n1().k1();
        if (k12 != null && (context = getContext()) != null) {
            com.harman.jbl.partybox.ui.equalizer.e r12 = r1();
            kotlin.jvm.internal.F.m(context);
            r12.b0(context, k12);
        }
        if (!M1() && !N1()) {
            com.harman.log.f.a(TAG, "StageDashboardFragment  getDeviceData:current device is not offline or standby");
            com.harman.jbl.partybox.ui.main.o.G0(n1(), null, 1, null);
            HmDevice k13 = n1().k1();
            if (k13 != null) {
                s1().j0(k13);
            }
            HmDevice k14 = n1().k1();
            if (k14 != null) {
                s1().l0(k14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2() {
        StereoQuitDialogFragment stereoQuitDialogFragment;
        Dialog dialog;
        StereoQuitDialogFragment stereoQuitDialogFragment2 = this.f43086b1;
        if ((stereoQuitDialogFragment2 != null && stereoQuitDialogFragment2.isAdded()) || ((stereoQuitDialogFragment = this.f43086b1) != null && (dialog = stereoQuitDialogFragment.getDialog()) != null && true == dialog.isShowing())) {
            com.harman.log.f.a(TAG, "StageDashboardFragment Stereo Quit return");
            return;
        }
        StereoQuitDialogFragment stereoQuitDialogFragment3 = new StereoQuitDialogFragment();
        this.f43086b1 = stereoQuitDialogFragment3;
        stereoQuitDialogFragment3.show(getChildFragmentManager(), StereoQuitDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.equalizer.a m1() {
        return (com.harman.jbl.partybox.ui.equalizer.a) this.f43079U0.getValue();
    }

    private final void m2() {
        C1885i3 c1885i3;
        RelativeLayout d4;
        C1868f1 j12 = j1();
        j12.d().setLayoutTransition(new LayoutTransition());
        if ((M1() || N1()) && (c1885i3 = this.f43082X0) != null && (d4 = c1885i3.d()) != null) {
            kotlin.jvm.internal.F.m(d4);
            P1(d4);
        }
        if (j12.f39567c0.getParent() != null) {
            j12.f39567c0.inflate();
        } else {
            j12.f39567c0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o n1() {
        return (com.harman.jbl.partybox.ui.main.o) this.f43076R0.getValue();
    }

    private final void n2() {
        androidx.navigation.I h4 = z0.h();
        kotlin.jvm.internal.F.o(h4, "actionToEqEditorFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, h4);
    }

    private final int o1(int i4, String str) {
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    return j.f.e6;
                }
                return j.f.i6;
            }
            return j.f.h6;
        }
        if (kotlin.jvm.internal.F.g(str, "04")) {
            return j.f.g6;
        }
        return j.f.f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2() {
        final C1868f1 j12 = j1();
        ConstraintLayout layoutStandby = j12.f39556R;
        kotlin.jvm.internal.F.o(layoutStandby, "layoutStandby");
        layoutStandby.setVisibility(0);
        ProgressBar powerOnProgressBar = j12.f39562X;
        kotlin.jvm.internal.F.o(powerOnProgressBar, "powerOnProgressBar");
        powerOnProgressBar.setVisibility(0);
        ImageView connectErrorImageView = j12.f39546H;
        kotlin.jvm.internal.F.o(connectErrorImageView, "connectErrorImageView");
        connectErrorImageView.setVisibility(8);
        j12.f39547I.setText(getString(j.m.I6));
        ConstraintLayout d4 = j12.f39548J.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        P1(d4);
        j12.f39548J.f38647F.setClickable(false);
        j12.f39548J.f38653L.setEnabled(false);
        j12.f39548J.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.p2(view);
            }
        });
        j12.f39556R.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StageDashboardFragment.q2(StageDashboardFragment.this, j12, view);
            }
        });
        HmDevice k12 = n1().k1();
        if (k12 != null) {
            C2323l.f(androidx.lifecycle.F.a(this), null, null, new G(k12, null), 3, null);
        }
    }

    static /* synthetic */ int p1(StageDashboardFragment stageDashboardFragment, int i4, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = "01";
        }
        return stageDashboardFragment.o1(i4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DashboardBannerDialogFragment q1() {
        return (DashboardBannerDialogFragment) this.f43091g1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(StageDashboardFragment this$0, C1868f1 this_apply, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(this_apply, "$this_apply");
        ConstraintLayout d4 = this_apply.f39548J.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        this$0.r2(d4);
        this_apply.f39548J.d().setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.equalizer.e r1() {
        return (com.harman.jbl.partybox.ui.equalizer.e) this.f43078T0.getValue();
    }

    private final void r2(View view) {
        view.setForeground(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E0 s1() {
        return (E0) this.f43077S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(HmDevice hmDevice) {
        String p4;
        boolean z3;
        int i4;
        kotlin.jvm.internal.F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
        if (d4.l(hmDevice)) {
            p4 = n1().E1(hmDevice);
            if (p4 == null) {
                p4 = hmDevice.p();
            }
        } else {
            p4 = hmDevice.p();
        }
        int i5 = 0;
        j1().f39548J.f38649H.setVisibility(0);
        j1().f39548J.f38649H.setText(p4);
        com.harman.log.f.a(TAG, "StageDashboardFragment updateBatteryAndDeviceName:" + p4);
        com.harman.log.f.a(TAG, "StageDashboardFragment updateBatteryAndDeviceName:" + hmDevice.i());
        com.harman.log.f.a(TAG, "StageDashboardFragment updateBatteryAndDeviceName:" + hmDevice.M());
        com.harman.log.f.a(TAG, "StageDashboardFragment updateBatteryAndDeviceName:" + hmDevice.f());
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
        com.harman.log.f.a(TAG, "StageDashboardFragment updateBatteryAndDeviceName secondary battery:" + partyBoxDevice.l1().get("Device_Battery"));
        if (M1()) {
            LinearLayout layoutGroupBattery = j1().f39548J.f38650I;
            kotlin.jvm.internal.F.o(layoutGroupBattery, "layoutGroupBattery");
            layoutGroupBattery.setVisibility(8);
            return;
        }
        LinearLayout layoutGroupBattery2 = j1().f39548J.f38650I;
        kotlin.jvm.internal.F.o(layoutGroupBattery2, "layoutGroupBattery");
        layoutGroupBattery2.setVisibility(0);
        if (d4.l(hmDevice)) {
            BatteryView batteryView = j1().f39548J.f38651J;
            BatteryInfo j4 = d4.j(partyBoxDevice, AudioChannel.STEREO_LEFT);
            kotlin.jvm.internal.F.m(batteryView);
            boolean z4 = true;
            if (j4 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            batteryView.setVisibility(i4);
            if (j4 != null) {
                batteryView.c(j4, "L");
            }
            BatteryView batteryView2 = j1().f39548J.f38652K;
            BatteryInfo j5 = d4.j(partyBoxDevice, AudioChannel.STEREO_RIGHT);
            kotlin.jvm.internal.F.m(batteryView2);
            if (j5 == null) {
                z4 = false;
            }
            if (!z4) {
                i5 = 8;
            }
            batteryView2.setVisibility(i5);
            if (j5 != null) {
                batteryView2.c(j5, "R");
                return;
            }
            return;
        }
        BatteryView rightBatteryView = j1().f39548J.f38652K;
        kotlin.jvm.internal.F.o(rightBatteryView, "rightBatteryView");
        rightBatteryView.setVisibility(8);
        if (partyBoxDevice.F1()) {
            BatteryView leftBatteryView = j1().f39548J.f38651J;
            kotlin.jvm.internal.F.o(leftBatteryView, "leftBatteryView");
            leftBatteryView.setVisibility(8);
            return;
        }
        BatteryView batteryView3 = j1().f39548J.f38651J;
        kotlin.jvm.internal.F.m(batteryView3);
        batteryView3.setVisibility(0);
        BatteryInfo f4 = hmDevice.f();
        if (f4 != null) {
            batteryView3.c(f4, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(HmDevice hmDevice) {
        kotlin.jvm.internal.F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        if (((PartyBoxDevice) hmDevice).i1() == PartyConnectStatus.PARTY_CONNECT_WIRED) {
            DeviceRole J3 = hmDevice.J();
            DeviceRole.a aVar = DeviceRole.Companion;
            if (J3 == aVar.a(2)) {
                this.f43083Y0 = true;
                return;
            } else {
                if (hmDevice.J() == aVar.a(1)) {
                    this.f43084Z0 = true;
                    return;
                }
                return;
            }
        }
        this.f43084Z0 = false;
        this.f43083Y0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t2(PartyBoxDevice partyBoxDevice) {
        Integer num;
        C1868f1 j12 = j1();
        Context context = getContext();
        kotlin.H0 h02 = null;
        Integer num2 = null;
        if (context != null) {
            num = Integer.valueOf(com.harman.sdk.utils.d.r(context, partyBoxDevice.q(), partyBoxDevice.o()));
        } else {
            num = null;
        }
        ViewGroup.LayoutParams layoutParams = j12.f39549K.getLayoutParams();
        kotlin.jvm.internal.F.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = com.harman.jbl.partybox.utils.j.a(getContext(), 18.0f);
        if (num != null) {
            com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
            if (d4.l(partyBoxDevice)) {
                HmDevice g4 = d4.g(partyBoxDevice);
                if (g4 != null) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        num2 = Integer.valueOf(com.harman.sdk.utils.d.r(context2, g4.q(), g4.o()));
                    }
                    if (num2 != null) {
                        if (partyBoxDevice.i() == AudioChannel.STEREO_LEFT) {
                            j12.f39549K.b(GroupSpeakerView.f45773P, num.intValue(), num2.intValue());
                        } else {
                            j12.f39549K.b(GroupSpeakerView.f45773P, num2.intValue(), num.intValue());
                        }
                    } else {
                        j12.f39549K.b(GroupSpeakerView.f45773P, num.intValue(), num.intValue());
                    }
                    h02 = kotlin.H0.f51801a;
                }
                if (h02 == null) {
                    j12.f39549K.b(GroupSpeakerView.f45773P, num.intValue(), num.intValue());
                }
            } else {
                j12.f39549K.b(GroupSpeakerView.f45772O, num.intValue());
            }
        }
        if (com.harman.sdk.utils.d.Z(partyBoxDevice.q())) {
            j12.f39548J.f38653L.setVisibility(0);
            j12.f39548J.f38653L.setEnabled(!M1());
        } else {
            j12.f39548J.f38653L.setVisibility(4);
        }
    }

    private final void u1() {
        j1().d().setLayoutTransition(new LayoutTransition());
        if (this.f43082X0 != null) {
            j1().f39567c0.setVisibility(8);
            j1().f39566b0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2(String str) {
        com.harman.log.f.a(TAG, "updateDeviceRole called: " + str);
        HmDevice k12 = n1().k1();
        if (k12 == null || !kotlin.jvm.internal.F.g(k12.n(), str)) {
            return;
        }
        if (k12.J() == DeviceRole.STANDBY) {
            a2();
        } else if (k12.O() && k12.R() && !com.harman.jbl.partybox.ui.party.b.f44881a.g(k12)) {
            R1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(PartyBoxDevice partyBoxDevice) {
        boolean M12 = M1();
        boolean N12 = N1();
        com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
        boolean z3 = true;
        com.harman.log.f.a(TAG, "initBannerInAPlayTogetherParty isDeviceOffline = " + M12 + " isDeviceStandby() = " + N12 + " !mainDevice.hadGroupId() = " + (!d4.l(partyBoxDevice)));
        int i4 = 8;
        if (!M1() && !N1() && d4.l(partyBoxDevice)) {
            com.harman.jbl.partybox.ui.party.auracast.o oVar = com.harman.jbl.partybox.ui.party.auracast.o.f44854a;
            com.harman.log.f.a(TAG, "initBannerInAPlayTogetherParty mainDevice.isAurocastOn() = " + oVar.p(partyBoxDevice) + " mainDevice.isSecondaryDeviceAuracastOn()() = " + d4.r(partyBoxDevice));
            j1().f39544F.M0(this);
            j1().f39544F.v1(this);
            View d5 = j1().f39544F.d();
            kotlin.jvm.internal.F.o(d5, "getRoot(...)");
            if (!oVar.p(partyBoxDevice) && !d4.r(partyBoxDevice)) {
                z3 = false;
            }
            if (z3) {
                i4 = 0;
            }
            d5.setVisibility(i4);
            return;
        }
        View d6 = j1().f39544F.d();
        kotlin.jvm.internal.F.o(d6, "getRoot(...)");
        d6.setVisibility(8);
    }

    private final void v2() {
        TextView textView;
        C1868f1 j12 = j1();
        MatchWidthCardView matchWidthCardView = j12.f39565a0;
        matchWidthCardView.setVisibility(8);
        matchWidthCardView.getTitle().setText(getString(j.m.x6));
        matchWidthCardView.getDesc().setText(getString(j.m.y6));
        MatchWidthCardView matchWidthCardView2 = j12.f39566b0;
        matchWidthCardView2.getTitle().setText(getString(j.m.f41774j3));
        matchWidthCardView2.getDesc().setText(getString(j.m.B9));
        if (this.f43082X0 != null && n1().x1()) {
            C1885i3 c1885i3 = this.f43082X0;
            if (c1885i3 != null && (textView = c1885i3.f39696H) != null) {
                textView.setText(j.m.X9);
            }
            com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment Selected String : " + getString(j.m.X9));
        }
        com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment Selected String : " + getString(j.m.W6));
        com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment Selected String : " + getString(j.m.f41737c1));
        com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment Selected String : " + getString(j.m.x6));
        com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment Selected String : " + getString(j.m.f41774j3));
    }

    private final void w1() {
        if (isAdded()) {
            com.harman.log.f.a(TAG, "BLE_LOG create initBassBoostFragment");
            j1().f39545G.setVisibility(0);
            this.f43081W0 = new BassBoostFragment();
            androidx.fragment.app.F q4 = getParentFragmentManager().q();
            int i4 = j.h.f41280h1;
            BassBoostFragment bassBoostFragment = this.f43081W0;
            kotlin.jvm.internal.F.m(bassBoostFragment);
            q4.C(i4, bassBoostFragment).r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(int i4, WirelessMicInfo wirelessMicInfo, String str) {
        float f4;
        String str2;
        kotlin.H0 h02;
        com.harman.log.f.a(TAG, "StageDashboardFragment updateMicConnectionView: " + i4);
        ConstraintLayout constraintLayout = j1().f39560V.f38549F;
        if (i4 == 0) {
            f4 = 0.4f;
        } else {
            f4 = 1.0f;
        }
        constraintLayout.setAlpha(f4);
        kotlin.H0 h03 = null;
        if (wirelessMicInfo != null) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        ImageView ivIconMic1 = j1().f39560V.f38550G;
                        kotlin.jvm.internal.F.o(ivIconMic1, "ivIconMic1");
                        com.harman.jbl.partybox.utils.q.i(ivIconMic1);
                        j1().f39560V.f38550G.setImageResource(j.f.e6);
                        ImageView ivIconMic2 = j1().f39560V.f38551H;
                        kotlin.jvm.internal.F.o(ivIconMic2, "ivIconMic2");
                        com.harman.jbl.partybox.utils.q.c(ivIconMic2);
                        BatteryView mic1BatteryView = j1().f39560V.f38553J;
                        kotlin.jvm.internal.F.o(mic1BatteryView, "mic1BatteryView");
                        com.harman.jbl.partybox.utils.q.d(mic1BatteryView);
                        BatteryView mic2BatteryView = j1().f39560V.f38554K;
                        kotlin.jvm.internal.F.o(mic2BatteryView, "mic2BatteryView");
                        com.harman.jbl.partybox.utils.q.d(mic2BatteryView);
                    } else {
                        ImageView ivIconMic12 = j1().f39560V.f38550G;
                        kotlin.jvm.internal.F.o(ivIconMic12, "ivIconMic1");
                        com.harman.jbl.partybox.utils.q.i(ivIconMic12);
                        ImageView ivIconMic22 = j1().f39560V.f38551H;
                        kotlin.jvm.internal.F.o(ivIconMic22, "ivIconMic2");
                        com.harman.jbl.partybox.utils.q.i(ivIconMic22);
                        ImageView imageView = j1().f39560V.f38550G;
                        int e4 = wirelessMicInfo.e();
                        if (wirelessMicInfo.d() != 0) {
                            kotlin.jvm.internal.W w3 = kotlin.jvm.internal.W.f52310a;
                            str2 = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.d())}, 1));
                            kotlin.jvm.internal.F.o(str2, "format(...)");
                        } else {
                            str2 = str;
                        }
                        imageView.setImageResource(o1(e4, str2));
                        ImageView imageView2 = j1().f39560V.f38551H;
                        int j4 = wirelessMicInfo.j();
                        if (wirelessMicInfo.i() != 0) {
                            kotlin.jvm.internal.W w4 = kotlin.jvm.internal.W.f52310a;
                            str = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.i())}, 1));
                            kotlin.jvm.internal.F.o(str, "format(...)");
                        }
                        imageView2.setImageResource(o1(j4, str));
                        BatteryInfo g4 = wirelessMicInfo.g();
                        if (g4 != null) {
                            BatteryView mic1BatteryView2 = j1().f39560V.f38553J;
                            kotlin.jvm.internal.F.o(mic1BatteryView2, "mic1BatteryView");
                            com.harman.jbl.partybox.utils.q.i(mic1BatteryView2);
                            j1().f39560V.f38553J.c(g4, null);
                            h02 = kotlin.H0.f51801a;
                        } else {
                            h02 = null;
                        }
                        if (h02 == null) {
                            BatteryView mic1BatteryView3 = j1().f39560V.f38553J;
                            kotlin.jvm.internal.F.o(mic1BatteryView3, "mic1BatteryView");
                            com.harman.jbl.partybox.utils.q.d(mic1BatteryView3);
                        }
                        BatteryInfo l4 = wirelessMicInfo.l();
                        if (l4 != null) {
                            BatteryView mic2BatteryView2 = j1().f39560V.f38554K;
                            kotlin.jvm.internal.F.o(mic2BatteryView2, "mic2BatteryView");
                            com.harman.jbl.partybox.utils.q.i(mic2BatteryView2);
                            j1().f39560V.f38554K.c(l4, null);
                            h03 = kotlin.H0.f51801a;
                        }
                        if (h03 == null) {
                            BatteryView mic2BatteryView3 = j1().f39560V.f38554K;
                            kotlin.jvm.internal.F.o(mic2BatteryView3, "mic2BatteryView");
                            com.harman.jbl.partybox.utils.q.d(mic2BatteryView3);
                        }
                    }
                } else {
                    ImageView imageView3 = j1().f39560V.f38550G;
                    int j5 = wirelessMicInfo.j();
                    if (wirelessMicInfo.i() != 0) {
                        kotlin.jvm.internal.W w5 = kotlin.jvm.internal.W.f52310a;
                        str = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.i())}, 1));
                        kotlin.jvm.internal.F.o(str, "format(...)");
                    }
                    imageView3.setImageResource(o1(j5, str));
                    ImageView ivIconMic23 = j1().f39560V.f38551H;
                    kotlin.jvm.internal.F.o(ivIconMic23, "ivIconMic2");
                    com.harman.jbl.partybox.utils.q.c(ivIconMic23);
                    ImageView ivIconMic13 = j1().f39560V.f38550G;
                    kotlin.jvm.internal.F.o(ivIconMic13, "ivIconMic1");
                    com.harman.jbl.partybox.utils.q.i(ivIconMic13);
                    BatteryInfo l5 = wirelessMicInfo.l();
                    if (l5 != null) {
                        BatteryView mic1BatteryView4 = j1().f39560V.f38553J;
                        kotlin.jvm.internal.F.o(mic1BatteryView4, "mic1BatteryView");
                        com.harman.jbl.partybox.utils.q.i(mic1BatteryView4);
                        j1().f39560V.f38553J.c(l5, null);
                        h03 = kotlin.H0.f51801a;
                    }
                    if (h03 == null) {
                        BatteryView mic1BatteryView5 = j1().f39560V.f38553J;
                        kotlin.jvm.internal.F.o(mic1BatteryView5, "mic1BatteryView");
                        com.harman.jbl.partybox.utils.q.d(mic1BatteryView5);
                    }
                    BatteryView mic2BatteryView4 = j1().f39560V.f38554K;
                    kotlin.jvm.internal.F.o(mic2BatteryView4, "mic2BatteryView");
                    com.harman.jbl.partybox.utils.q.d(mic2BatteryView4);
                }
            } else {
                ImageView imageView4 = j1().f39560V.f38550G;
                int e5 = wirelessMicInfo.e();
                if (wirelessMicInfo.d() != 0) {
                    kotlin.jvm.internal.W w6 = kotlin.jvm.internal.W.f52310a;
                    str = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.d())}, 1));
                    kotlin.jvm.internal.F.o(str, "format(...)");
                }
                imageView4.setImageResource(o1(e5, str));
                ImageView ivIconMic24 = j1().f39560V.f38551H;
                kotlin.jvm.internal.F.o(ivIconMic24, "ivIconMic2");
                com.harman.jbl.partybox.utils.q.c(ivIconMic24);
                ImageView ivIconMic14 = j1().f39560V.f38550G;
                kotlin.jvm.internal.F.o(ivIconMic14, "ivIconMic1");
                com.harman.jbl.partybox.utils.q.i(ivIconMic14);
                BatteryInfo g5 = wirelessMicInfo.g();
                if (g5 != null) {
                    BatteryView mic1BatteryView6 = j1().f39560V.f38553J;
                    kotlin.jvm.internal.F.o(mic1BatteryView6, "mic1BatteryView");
                    com.harman.jbl.partybox.utils.q.i(mic1BatteryView6);
                    j1().f39560V.f38553J.c(g5, null);
                    h03 = kotlin.H0.f51801a;
                }
                if (h03 == null) {
                    BatteryView mic1BatteryView7 = j1().f39560V.f38553J;
                    kotlin.jvm.internal.F.o(mic1BatteryView7, "mic1BatteryView");
                    com.harman.jbl.partybox.utils.q.d(mic1BatteryView7);
                }
                BatteryView mic2BatteryView5 = j1().f39560V.f38554K;
                kotlin.jvm.internal.F.o(mic2BatteryView5, "mic2BatteryView");
                com.harman.jbl.partybox.utils.q.d(mic2BatteryView5);
            }
            h03 = kotlin.H0.f51801a;
        }
        if (h03 == null) {
            ImageView ivIconMic15 = j1().f39560V.f38550G;
            kotlin.jvm.internal.F.o(ivIconMic15, "ivIconMic1");
            com.harman.jbl.partybox.utils.q.i(ivIconMic15);
            j1().f39560V.f38550G.setImageResource(j.f.e6);
            ImageView ivIconMic25 = j1().f39560V.f38551H;
            kotlin.jvm.internal.F.o(ivIconMic25, "ivIconMic2");
            com.harman.jbl.partybox.utils.q.c(ivIconMic25);
            BatteryView mic1BatteryView8 = j1().f39560V.f38553J;
            kotlin.jvm.internal.F.o(mic1BatteryView8, "mic1BatteryView");
            com.harman.jbl.partybox.utils.q.d(mic1BatteryView8);
            BatteryView mic2BatteryView6 = j1().f39560V.f38554K;
            kotlin.jvm.internal.F.o(mic2BatteryView6, "mic2BatteryView");
            com.harman.jbl.partybox.utils.q.d(mic2BatteryView6);
        }
    }

    private final void x1() {
        ActivityC0889g activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            com.harman.log.f.a(TAG, "initCardView return ");
            return;
        }
        A1();
        W1();
        C1();
        z1();
        w1();
    }

    static /* synthetic */ void x2(StageDashboardFragment stageDashboardFragment, int i4, WirelessMicInfo wirelessMicInfo, String str, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str = "01";
        }
        stageDashboardFragment.w2(i4, wirelessMicInfo, str);
    }

    private final void y1() {
        HmDevice k12 = n1().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            s1().u0(k12);
            a2();
            androidx.lifecycle.F.a(this).e(new C1974f(k12, null));
            t2(partyBoxDevice);
            Y1(partyBoxDevice);
            g2(partyBoxDevice);
            e2(partyBoxDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y2(boolean z3) {
        int i4;
        String str;
        RelativeLayout d4;
        if (isAdded() && isVisible()) {
            ConstraintLayout layoutStandby = j1().f39556R;
            kotlin.jvm.internal.F.o(layoutStandby, "layoutStandby");
            if (!z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            layoutStandby.setVisibility(i4);
            ConstraintLayout d5 = j1().f39548J.d();
            kotlin.jvm.internal.F.o(d5, "getRoot(...)");
            r2(d5);
            j1().f39548J.f38647F.setClickable(true);
            j1().f39548J.f38653L.setEnabled(true ^ M1());
            j1().f39548J.f38647F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StageDashboardFragment.z2(StageDashboardFragment.this, view);
                }
            });
            if (z3) {
                C1868f1 j12 = j1();
                int childCount = j12.f39554P.getChildCount() - 2;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = j12.f39554P.getChildAt(i5);
                    boolean z4 = childAt instanceof ForegroundMaskLayout;
                    com.harman.log.f.a(TAG, "updateStandbyView>>> layoutCardContainer.getChildAt index = " + i5 + ", view = " + childAt.getClass() + ", child is ForegroundMaskLayout = " + z4);
                    if (z4) {
                        ((ForegroundMaskLayout) childAt).b();
                    }
                }
                C1885i3 c1885i3 = this.f43082X0;
                if (c1885i3 != null && (d4 = c1885i3.d()) != null) {
                    kotlin.jvm.internal.F.m(d4);
                    r2(d4);
                    return;
                }
                return;
            }
            ProgressBar powerOnProgressBar = j1().f39562X;
            kotlin.jvm.internal.F.o(powerOnProgressBar, "powerOnProgressBar");
            powerOnProgressBar.setVisibility(8);
            ImageView connectErrorImageView = j1().f39546H;
            kotlin.jvm.internal.F.o(connectErrorImageView, "connectErrorImageView");
            connectErrorImageView.setVisibility(0);
            HmCustomFontTextView hmCustomFontTextView = j1().f39547I;
            Context context = getContext();
            if (context != null) {
                str = context.getString(j.m.f41677O);
            } else {
                str = null;
            }
            hmCustomFontTextView.setText(str);
        }
    }

    private final void z1() {
        EQCategory eQCategory;
        AdvancedEQSettings advancedEQSettings;
        HmDevice k12 = n1().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            com.harman.log.f.a(TAG, "initEQCard>>>>> is eq support:" + partyBoxDevice.P1());
            if (partyBoxDevice.P1()) {
                com.harman.log.f.a(TAG, "BLE_LOG StageDashboardFragment initEQCard");
                LinkedList<AdvancedEQSettings> b4 = k12.b();
                if (b4 != null && (advancedEQSettings = b4.get(0)) != null) {
                    eQCategory = advancedEQSettings.a();
                } else {
                    eQCategory = null;
                }
                if (eQCategory == EQCategory.CUSTOM) {
                    j1().f39551M.g(0);
                } else {
                    j1().f39551M.g(8);
                }
                j1().f39551M.d();
                j1().f39551M.setVisibility(0);
                j1().f39551M.setOnActionListener(this);
                return;
            }
            com.harman.log.f.a(TAG, "BLE_LOG EQ is not supported");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z2(StageDashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.Q1();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        com.harman.log.f.a(TAG, "handleOnBackPressed clicked");
        Q1();
    }

    @Override // com.harman.jbl.partybox.ui.widget.q
    public void onAction(@l3.e ClickEventType clickEventType) {
        com.harman.log.f.a(TAG, "onAction() >>> actionName = " + clickEventType);
        if (clickEventType == ClickEventType.ACTION_EDIT_CUSTOM_EQ) {
            n2();
        }
    }

    public final void onBannerInAPlayTogetherPartyClicked() {
        PartyBoxDevice partyBoxDevice;
        HmDevice k12 = n1().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice == null) {
            return;
        }
        androidx.lifecycle.F.a(this).e(new w(partyBoxDevice, null));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        X0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog;
        Dialog dialog2;
        super.onDestroyView();
        com.harman.sdk.b.f47608a.w(this.f43089e1);
        com.harman.jbl.partybox.ui.main.o.f44128m1.h(false);
        RemoveProductDialogFragment removeProductDialogFragment = this.f43085a1;
        if (removeProductDialogFragment != null && (dialog2 = removeProductDialogFragment.getDialog()) != null && dialog2.isShowing()) {
            RemoveProductDialogFragment removeProductDialogFragment2 = this.f43085a1;
            if (removeProductDialogFragment2 != null) {
                removeProductDialogFragment2.dismiss();
            }
            this.f43085a1 = null;
        }
        StereoEffectDialog stereoEffectDialog = this.f43088d1;
        if (stereoEffectDialog != null && (dialog = stereoEffectDialog.getDialog()) != null && dialog.isShowing()) {
            StereoEffectDialog stereoEffectDialog2 = this.f43088d1;
            if (stereoEffectDialog2 != null) {
                stereoEffectDialog2.dismiss();
            }
            this.f43088d1 = null;
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String q4;
        super.onResume();
        com.harman.log.f.a(TAG, "onResume() >>> ");
        n1().T2(false);
        n1().c3(false);
        HmDevice k12 = n1().k1();
        if (k12 != null && (q4 = k12.q()) != null) {
            S0(q4);
        }
        T1();
    }

    public final void onUnGroupSuccess(@l3.d HmDevice mainDevice) {
        kotlin.jvm.internal.F.p(mainDevice, "mainDevice");
        com.harman.log.f.a(TAG, "onUnGroupSuccess() >>> ");
        n1().z2(mainDevice.n());
        Q1();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:10)(2:25|26))(3:27|28|(1:30))|11|12|(4:14|(1:16)|17|(3:19|20|21))|23|20|21))|33|6|7|(0)(0)|11|12|(0)|23|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        r9 = kotlin.Result.f51807F;
        r8 = kotlin.Result.b(kotlin.W.a(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onUngroupBtnClick(@l3.d com.harman.sdk.device.HmDevice r8, @l3.e com.harman.sdk.device.HmDevice r9, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment.x
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$x r0 = (com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment.x) r0
            int r1 = r0.f43155J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43155J = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$x r0 = new com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$x
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f43153H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f43155J
            r3 = 0
            java.lang.String r4 = "StageDashboardFragment"
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L2c
            goto L65
        L2c:
            r8 = move-exception
            goto L74
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.W.n(r10)
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r10.t(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "onUnGroupClick() >>> send unGroup CMD to device "
            r2.append(r6)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.harman.log.f.d(r4, r10)
            kotlin.Result$a r10 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2c
            com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$y r10 = new com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment$y     // Catch: java.lang.Throwable -> L2c
            r10.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> L2c
            r0.f43155J = r5     // Catch: java.lang.Throwable -> L2c
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r10 = kotlinx.coroutines.w1.c(r8, r10, r0)     // Catch: java.lang.Throwable -> L2c
            if (r10 != r1) goto L65
            return r1
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2c
            boolean r8 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L7e
        L74:
            kotlin.Result$a r9 = kotlin.Result.f51807F
            java.lang.Object r8 = kotlin.W.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
        L7e:
            boolean r9 = kotlin.Result.j(r8)
            if (r9 == 0) goto L9c
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r5)
            boolean r10 = kotlin.Result.i(r8)
            if (r10 == 0) goto L8f
            goto L90
        L8f:
            r3 = r8
        L90:
            boolean r8 = kotlin.jvm.internal.F.g(r9, r3)
            if (r8 == 0) goto L9c
            java.lang.String r8 = "onUnGroupClick() >>> unGroup suc"
            com.harman.log.f.d(r4, r8)
            goto La2
        L9c:
            java.lang.String r8 = "onUnGroupClick() >>> unGroup fail"
            com.harman.log.f.b(r4, r8)
            r5 = 0
        La2:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment.onUngroupBtnClick(com.harman.sdk.device.HmDevice, com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        com.harman.sdk.b.f47608a.u(this.f43089e1);
        initView();
        x1();
        y1();
        D1();
        l1();
        v2();
        u1();
        androidx.lifecycle.F.a(this).e(new z(null));
        n1().g2();
    }
}
