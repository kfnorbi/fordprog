// Generated from Telefonszam.g4 by ANTLR 4.5.3

package generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TelefonszamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plusz=1, INT1=2, INT2=3, INT3=4, INT4=5, INT5=6, INT6=7, INT7=8, INT8=9, 
		INT9=10, Kotojel=11, WS=12, DIGIT=13;
	public static final int
		RULE_eval = 0, RULE_orszag = 1, RULE_elojel = 2, RULE_elso = 3, RULE_korzet = 4, 
		RULE_masodik = 5, RULE_harmadik = 6, RULE_negyedik = 7, RULE_otodik = 8, 
		RULE_hatodik = 9, RULE_hetedik = 10, RULE_nyolcadik = 11;
	public static final String[] ruleNames = {
		"eval", "orszag", "elojel", "elso", "korzet", "masodik", "harmadik", "negyedik", 
		"otodik", "hatodik", "hetedik", "nyolcadik"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", null, null, null, null, null, null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Plusz", "INT1", "INT2", "INT3", "INT4", "INT5", "INT6", "INT7", 
		"INT8", "INT9", "Kotojel", "WS", "DIGIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Telefonszam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TelefonszamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public ElsoContext elso() {
			return getRuleContext(ElsoContext.class,0);
		}
		public MasodikContext masodik() {
			return getRuleContext(MasodikContext.class,0);
		}
		public HarmadikContext harmadik() {
			return getRuleContext(HarmadikContext.class,0);
		}
		public NegyedikContext negyedik() {
			return getRuleContext(NegyedikContext.class,0);
		}
		public OtodikContext otodik() {
			return getRuleContext(OtodikContext.class,0);
		}
		public HatodikContext hatodik() {
			return getRuleContext(HatodikContext.class,0);
		}
		public HetedikContext hetedik() {
			return getRuleContext(HetedikContext.class,0);
		}
		public NyolcadikContext nyolcadik() {
			return getRuleContext(NyolcadikContext.class,0);
		}
		public ElojelContext elojel() {
			return getRuleContext(ElojelContext.class,0);
		}
		public OrszagContext orszag() {
			return getRuleContext(OrszagContext.class,0);
		}
		public KorzetContext korzet() {
			return getRuleContext(KorzetContext.class,0);
		}
		public List<TerminalNode> Kotojel() { return getTokens(TelefonszamParser.Kotojel); }
		public TerminalNode Kotojel(int i) {
			return getToken(TelefonszamParser.Kotojel, i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if (_la==Plusz) {
				{
				setState(24);
				elojel();
				}
			}

			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(27);
				orszag();
				setState(29);
				_la = _input.LA(1);
				if (_la==Kotojel) {
					{
					setState(28);
					match(Kotojel);
					}
				}

				}
				break;
			}
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(33);
				korzet();
				setState(35);
				_la = _input.LA(1);
				if (_la==Kotojel) {
					{
					setState(34);
					match(Kotojel);
					}
				}

				}
				break;
			}
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(39);
				elso();
				}
				break;
			case 2:
				{
				setState(40);
				masodik();
				}
				break;
			case 3:
				{
				setState(41);
				harmadik();
				}
				break;
			case 4:
				{
				setState(42);
				negyedik();
				}
				break;
			case 5:
				{
				setState(43);
				otodik();
				}
				break;
			case 6:
				{
				setState(44);
				hatodik();
				}
				break;
			case 7:
				{
				setState(45);
				hetedik();
				}
				break;
			case 8:
				{
				setState(46);
				nyolcadik();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrszagContext extends ParserRuleContext {
		public TerminalNode INT2() { return getToken(TelefonszamParser.INT2, 0); }
		public OrszagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orszag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterOrszag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitOrszag(this);
		}
	}

	public final OrszagContext orszag() throws RecognitionException {
		OrszagContext _localctx = new OrszagContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_orszag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(INT2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElojelContext extends ParserRuleContext {
		public TerminalNode Plusz() { return getToken(TelefonszamParser.Plusz, 0); }
		public ElojelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elojel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterElojel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitElojel(this);
		}
	}

	public final ElojelContext elojel() throws RecognitionException {
		ElojelContext _localctx = new ElojelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elojel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Plusz);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsoContext extends ParserRuleContext {
		public TerminalNode INT9() { return getToken(TelefonszamParser.INT9, 0); }
		public ElsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterElso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitElso(this);
		}
	}

	public final ElsoContext elso() throws RecognitionException {
		ElsoContext _localctx = new ElsoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(INT9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KorzetContext extends ParserRuleContext {
		public TerminalNode INT1() { return getToken(TelefonszamParser.INT1, 0); }
		public TerminalNode INT2() { return getToken(TelefonszamParser.INT2, 0); }
		public KorzetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_korzet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterKorzet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitKorzet(this);
		}
	}

	public final KorzetContext korzet() throws RecognitionException {
		KorzetContext _localctx = new KorzetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_korzet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==INT1 || _la==INT2) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MasodikContext extends ParserRuleContext {
		public TerminalNode INT7() { return getToken(TelefonszamParser.INT7, 0); }
		public MasodikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_masodik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterMasodik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitMasodik(this);
		}
	}

	public final MasodikContext masodik() throws RecognitionException {
		MasodikContext _localctx = new MasodikContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_masodik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(INT7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HarmadikContext extends ParserRuleContext {
		public TerminalNode INT6() { return getToken(TelefonszamParser.INT6, 0); }
		public HarmadikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_harmadik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterHarmadik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitHarmadik(this);
		}
	}

	public final HarmadikContext harmadik() throws RecognitionException {
		HarmadikContext _localctx = new HarmadikContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_harmadik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(INT6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegyedikContext extends ParserRuleContext {
		public List<TerminalNode> INT3() { return getTokens(TelefonszamParser.INT3); }
		public TerminalNode INT3(int i) {
			return getToken(TelefonszamParser.INT3, i);
		}
		public TerminalNode Kotojel() { return getToken(TelefonszamParser.Kotojel, 0); }
		public NegyedikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negyedik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterNegyedik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitNegyedik(this);
		}
	}

	public final NegyedikContext negyedik() throws RecognitionException {
		NegyedikContext _localctx = new NegyedikContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_negyedik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(INT3);
			setState(62);
			match(Kotojel);
			setState(63);
			match(INT3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtodikContext extends ParserRuleContext {
		public TerminalNode INT4() { return getToken(TelefonszamParser.INT4, 0); }
		public TerminalNode Kotojel() { return getToken(TelefonszamParser.Kotojel, 0); }
		public TerminalNode INT3() { return getToken(TelefonszamParser.INT3, 0); }
		public OtodikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otodik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterOtodik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitOtodik(this);
		}
	}

	public final OtodikContext otodik() throws RecognitionException {
		OtodikContext _localctx = new OtodikContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_otodik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(INT4);
			setState(66);
			match(Kotojel);
			setState(67);
			match(INT3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HatodikContext extends ParserRuleContext {
		public List<TerminalNode> INT2() { return getTokens(TelefonszamParser.INT2); }
		public TerminalNode INT2(int i) {
			return getToken(TelefonszamParser.INT2, i);
		}
		public List<TerminalNode> Kotojel() { return getTokens(TelefonszamParser.Kotojel); }
		public TerminalNode Kotojel(int i) {
			return getToken(TelefonszamParser.Kotojel, i);
		}
		public TerminalNode INT3() { return getToken(TelefonszamParser.INT3, 0); }
		public HatodikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hatodik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterHatodik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitHatodik(this);
		}
	}

	public final HatodikContext hatodik() throws RecognitionException {
		HatodikContext _localctx = new HatodikContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hatodik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(INT2);
			setState(70);
			match(Kotojel);
			setState(71);
			match(INT2);
			setState(72);
			match(Kotojel);
			setState(73);
			match(INT3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HetedikContext extends ParserRuleContext {
		public TerminalNode INT3() { return getToken(TelefonszamParser.INT3, 0); }
		public TerminalNode Kotojel() { return getToken(TelefonszamParser.Kotojel, 0); }
		public TerminalNode INT4() { return getToken(TelefonszamParser.INT4, 0); }
		public HetedikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hetedik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterHetedik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitHetedik(this);
		}
	}

	public final HetedikContext hetedik() throws RecognitionException {
		HetedikContext _localctx = new HetedikContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hetedik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(INT3);
			setState(76);
			match(Kotojel);
			setState(77);
			match(INT4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NyolcadikContext extends ParserRuleContext {
		public TerminalNode INT3() { return getToken(TelefonszamParser.INT3, 0); }
		public List<TerminalNode> Kotojel() { return getTokens(TelefonszamParser.Kotojel); }
		public TerminalNode Kotojel(int i) {
			return getToken(TelefonszamParser.Kotojel, i);
		}
		public List<TerminalNode> INT2() { return getTokens(TelefonszamParser.INT2); }
		public TerminalNode INT2(int i) {
			return getToken(TelefonszamParser.INT2, i);
		}
		public NyolcadikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nyolcadik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).enterNyolcadik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TelefonszamListener ) ((TelefonszamListener)listener).exitNyolcadik(this);
		}
	}

	public final NyolcadikContext nyolcadik() throws RecognitionException {
		NyolcadikContext _localctx = new NyolcadikContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nyolcadik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(INT3);
			setState(80);
			match(Kotojel);
			setState(81);
			match(INT2);
			setState(82);
			match(Kotojel);
			setState(83);
			match(INT2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\5\2 \n\2\5\2\"\n\2\3\2\3\2\5\2&"+
		"\n\2\5\2(\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\4\5W\2\33\3\2\2\2\4\63\3"+
		"\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20"+
		"?\3\2\2\2\22C\3\2\2\2\24G\3\2\2\2\26M\3\2\2\2\30Q\3\2\2\2\32\34\5\6\4"+
		"\2\33\32\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\37\5\4\3\2\36 \7\r\2\2\37"+
		"\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\35\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2"+
		"#%\5\n\6\2$&\7\r\2\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'#\3\2\2\2\'(\3\2\2"+
		"\2(\61\3\2\2\2)\62\5\b\5\2*\62\5\f\7\2+\62\5\16\b\2,\62\5\20\t\2-\62\5"+
		"\22\n\2.\62\5\24\13\2/\62\5\26\f\2\60\62\5\30\r\2\61)\3\2\2\2\61*\3\2"+
		"\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60"+
		"\3\2\2\2\62\3\3\2\2\2\63\64\7\5\2\2\64\5\3\2\2\2\65\66\7\3\2\2\66\7\3"+
		"\2\2\2\678\7\f\2\28\t\3\2\2\29:\t\2\2\2:\13\3\2\2\2;<\7\n\2\2<\r\3\2\2"+
		"\2=>\7\t\2\2>\17\3\2\2\2?@\7\6\2\2@A\7\r\2\2AB\7\6\2\2B\21\3\2\2\2CD\7"+
		"\7\2\2DE\7\r\2\2EF\7\6\2\2F\23\3\2\2\2GH\7\5\2\2HI\7\r\2\2IJ\7\5\2\2J"+
		"K\7\r\2\2KL\7\6\2\2L\25\3\2\2\2MN\7\6\2\2NO\7\r\2\2OP\7\7\2\2P\27\3\2"+
		"\2\2QR\7\6\2\2RS\7\r\2\2ST\7\5\2\2TU\7\r\2\2UV\7\5\2\2V\31\3\2\2\2\b\33"+
		"\37!%\'\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}