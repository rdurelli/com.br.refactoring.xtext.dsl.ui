package com.br.refactoring.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.br.refactoring.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'float'", "'char'", "'byte'", "'short'", "'long'", "'double'", "'model'", "'importing'", "'Class'", "'{'", "'}'", "'@'", "'def'", "'Rename_Feature'", "'Refactoring_RenameClass'", "'classToBeRename'", "':'", "'newName'", "'Refactiong_RenameAttribute'", "'sourceClass'", "'attributeToBeRename'", "'Refactoring_RenameMethod'", "'methodToBeRename'", "'MovingFeaturesBetweenObjects'", "'Refactoring_MoveAttribute'", "'targetClass'", "'attributeToBeMoved'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleModel EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__Model__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleImport EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__Import__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleType EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__Type__Alternatives )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClass"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:144:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:145:1: ( ruleClass EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:146:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_in_entryRuleClass241);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:153:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:157:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__Class__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__Class__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( rule__Class__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:160:2: rule__Class__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__0_in_ruleClass274);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:172:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:173:1: ( ruleAttribute EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:174:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute301);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:181:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:185:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ( rule__Attribute__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:188:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0_in_ruleAttribute334);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleElementType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:200:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:201:1: ( ruleElementType EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:202:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElementType_in_entryRuleElementType361);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:209:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:213:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__ElementType__Alternatives ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__ElementType__Alternatives ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:215:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( rule__ElementType__Alternatives )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:216:2: rule__ElementType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementType__Alternatives_in_ruleElementType394);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:228:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:229:1: ( ruleBasicType EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:230:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBasicType_in_entryRuleBasicType421);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBasicType428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:237:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:241:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:243:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ( rule__BasicType__TypeNameAssignment )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:244:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType454);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:256:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:257:1: ( ruleClassType EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:258:1: ruleClassType EOF
            {
             before(grammarAccess.getClassTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassType_in_entryRuleClassType481);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getClassTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassType488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:265:1: ruleClassType : ( ( rule__ClassType__ClassTypeAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:269:2: ( ( ( rule__ClassType__ClassTypeAssignment ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:270:1: ( ( rule__ClassType__ClassTypeAssignment ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:270:1: ( ( rule__ClassType__ClassTypeAssignment ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:271:1: ( rule__ClassType__ClassTypeAssignment )
            {
             before(grammarAccess.getClassTypeAccess().getClassTypeAssignment()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ( rule__ClassType__ClassTypeAssignment )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:272:2: rule__ClassType__ClassTypeAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClassType__ClassTypeAssignment_in_ruleClassType514);
            rule__ClassType__ClassTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getClassTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleMethod"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:284:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:285:1: ( ruleMethod EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:286:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod541);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:293:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:297:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( ( rule__Method__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( ( rule__Method__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:299:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ( rule__Method__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:300:2: rule__Method__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__0_in_ruleMethod574);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleRefactoring"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:312:1: entryRuleRefactoring : ruleRefactoring EOF ;
    public final void entryRuleRefactoring() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:313:1: ( ruleRefactoring EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:314:1: ruleRefactoring EOF
            {
             before(grammarAccess.getRefactoringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_entryRuleRefactoring601);
            ruleRefactoring();

            state._fsp--;

             after(grammarAccess.getRefactoringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRefactoring608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefactoring"


    // $ANTLR start "ruleRefactoring"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:321:1: ruleRefactoring : ( ( rule__Refactoring__Alternatives ) ) ;
    public final void ruleRefactoring() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:325:2: ( ( ( rule__Refactoring__Alternatives ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:326:1: ( ( rule__Refactoring__Alternatives ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:326:1: ( ( rule__Refactoring__Alternatives ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:327:1: ( rule__Refactoring__Alternatives )
            {
             before(grammarAccess.getRefactoringAccess().getAlternatives()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( rule__Refactoring__Alternatives )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:328:2: rule__Refactoring__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Refactoring__Alternatives_in_ruleRefactoring634);
            rule__Refactoring__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRefactoringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefactoring"


    // $ANTLR start "entryRuleRenameFeature"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:340:1: entryRuleRenameFeature : ruleRenameFeature EOF ;
    public final void entryRuleRenameFeature() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:341:1: ( ruleRenameFeature EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:342:1: ruleRenameFeature EOF
            {
             before(grammarAccess.getRenameFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature661);
            ruleRenameFeature();

            state._fsp--;

             after(grammarAccess.getRenameFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameFeature668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameFeature"


    // $ANTLR start "ruleRenameFeature"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:349:1: ruleRenameFeature : ( ( rule__RenameFeature__Group__0 ) ) ;
    public final void ruleRenameFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:353:2: ( ( ( rule__RenameFeature__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ( ( rule__RenameFeature__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ( ( rule__RenameFeature__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:355:1: ( rule__RenameFeature__Group__0 )
            {
             before(grammarAccess.getRenameFeatureAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ( rule__RenameFeature__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:356:2: rule__RenameFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__0_in_ruleRenameFeature694);
            rule__RenameFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameFeature"


    // $ANTLR start "entryRuleRenameClass"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:368:1: entryRuleRenameClass : ruleRenameClass EOF ;
    public final void entryRuleRenameClass() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:369:1: ( ruleRenameClass EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:370:1: ruleRenameClass EOF
            {
             before(grammarAccess.getRenameClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_entryRuleRenameClass721);
            ruleRenameClass();

            state._fsp--;

             after(grammarAccess.getRenameClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameClass728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameClass"


    // $ANTLR start "ruleRenameClass"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:377:1: ruleRenameClass : ( ( rule__RenameClass__Group__0 ) ) ;
    public final void ruleRenameClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:381:2: ( ( ( rule__RenameClass__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:382:1: ( ( rule__RenameClass__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:382:1: ( ( rule__RenameClass__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:383:1: ( rule__RenameClass__Group__0 )
            {
             before(grammarAccess.getRenameClassAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ( rule__RenameClass__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:384:2: rule__RenameClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__0_in_ruleRenameClass754);
            rule__RenameClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameClass"


    // $ANTLR start "entryRuleRenameAttribute"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:396:1: entryRuleRenameAttribute : ruleRenameAttribute EOF ;
    public final void entryRuleRenameAttribute() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:397:1: ( ruleRenameAttribute EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:398:1: ruleRenameAttribute EOF
            {
             before(grammarAccess.getRenameAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameAttribute_in_entryRuleRenameAttribute781);
            ruleRenameAttribute();

            state._fsp--;

             after(grammarAccess.getRenameAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameAttribute788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameAttribute"


    // $ANTLR start "ruleRenameAttribute"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:405:1: ruleRenameAttribute : ( ( rule__RenameAttribute__Group__0 ) ) ;
    public final void ruleRenameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:409:2: ( ( ( rule__RenameAttribute__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:410:1: ( ( rule__RenameAttribute__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:410:1: ( ( rule__RenameAttribute__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:411:1: ( rule__RenameAttribute__Group__0 )
            {
             before(grammarAccess.getRenameAttributeAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:412:1: ( rule__RenameAttribute__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:412:2: rule__RenameAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__0_in_ruleRenameAttribute814);
            rule__RenameAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameAttribute"


    // $ANTLR start "entryRuleRenameMethod"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:424:1: entryRuleRenameMethod : ruleRenameMethod EOF ;
    public final void entryRuleRenameMethod() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:425:1: ( ruleRenameMethod EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:426:1: ruleRenameMethod EOF
            {
             before(grammarAccess.getRenameMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameMethod_in_entryRuleRenameMethod841);
            ruleRenameMethod();

            state._fsp--;

             after(grammarAccess.getRenameMethodRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameMethod848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameMethod"


    // $ANTLR start "ruleRenameMethod"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:433:1: ruleRenameMethod : ( ( rule__RenameMethod__Group__0 ) ) ;
    public final void ruleRenameMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:437:2: ( ( ( rule__RenameMethod__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:438:1: ( ( rule__RenameMethod__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:438:1: ( ( rule__RenameMethod__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:439:1: ( rule__RenameMethod__Group__0 )
            {
             before(grammarAccess.getRenameMethodAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:440:1: ( rule__RenameMethod__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:440:2: rule__RenameMethod__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__0_in_ruleRenameMethod874);
            rule__RenameMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameMethod"


    // $ANTLR start "entryRuleMovingFeaturesBetweenObjects"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:452:1: entryRuleMovingFeaturesBetweenObjects : ruleMovingFeaturesBetweenObjects EOF ;
    public final void entryRuleMovingFeaturesBetweenObjects() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:453:1: ( ruleMovingFeaturesBetweenObjects EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:454:1: ruleMovingFeaturesBetweenObjects EOF
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMovingFeaturesBetweenObjects_in_entryRuleMovingFeaturesBetweenObjects901);
            ruleMovingFeaturesBetweenObjects();

            state._fsp--;

             after(grammarAccess.getMovingFeaturesBetweenObjectsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMovingFeaturesBetweenObjects908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovingFeaturesBetweenObjects"


    // $ANTLR start "ruleMovingFeaturesBetweenObjects"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ruleMovingFeaturesBetweenObjects : ( ( rule__MovingFeaturesBetweenObjects__Group__0 ) ) ;
    public final void ruleMovingFeaturesBetweenObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:465:2: ( ( ( rule__MovingFeaturesBetweenObjects__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:466:1: ( ( rule__MovingFeaturesBetweenObjects__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:466:1: ( ( rule__MovingFeaturesBetweenObjects__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:467:1: ( rule__MovingFeaturesBetweenObjects__Group__0 )
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:468:1: ( rule__MovingFeaturesBetweenObjects__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:468:2: rule__MovingFeaturesBetweenObjects__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__0_in_ruleMovingFeaturesBetweenObjects934);
            rule__MovingFeaturesBetweenObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovingFeaturesBetweenObjects"


    // $ANTLR start "entryRuleMoveAttribute"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:480:1: entryRuleMoveAttribute : ruleMoveAttribute EOF ;
    public final void entryRuleMoveAttribute() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:481:1: ( ruleMoveAttribute EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:482:1: ruleMoveAttribute EOF
            {
             before(grammarAccess.getMoveAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveAttribute_in_entryRuleMoveAttribute961);
            ruleMoveAttribute();

            state._fsp--;

             after(grammarAccess.getMoveAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoveAttribute968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveAttribute"


    // $ANTLR start "ruleMoveAttribute"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:489:1: ruleMoveAttribute : ( ( rule__MoveAttribute__Group__0 ) ) ;
    public final void ruleMoveAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:493:2: ( ( ( rule__MoveAttribute__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:494:1: ( ( rule__MoveAttribute__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:494:1: ( ( rule__MoveAttribute__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:495:1: ( rule__MoveAttribute__Group__0 )
            {
             before(grammarAccess.getMoveAttributeAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:496:1: ( rule__MoveAttribute__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:496:2: rule__MoveAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__0_in_ruleMoveAttribute994);
            rule__MoveAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveAttribute"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:508:1: rule__Type__Alternatives : ( ( ruleClass ) | ( ruleRefactoring ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:512:1: ( ( ruleClass ) | ( ruleRefactoring ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==27||LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:513:1: ( ruleClass )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:513:1: ( ruleClass )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:514:1: ruleClass
                    {
                     before(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_rule__Type__Alternatives1030);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:519:6: ( ruleRefactoring )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:519:6: ( ruleRefactoring )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:520:1: ruleRefactoring
                    {
                     before(grammarAccess.getTypeAccess().getRefactoringParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_rule__Type__Alternatives1047);
                    ruleRefactoring();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRefactoringParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:530:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleClassType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:534:1: ( ( ruleBasicType ) | ( ruleClassType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=19)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:535:1: ( ruleBasicType )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:535:1: ( ruleBasicType )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:536:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1079);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:541:6: ( ruleClassType )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:541:6: ( ruleClassType )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:542:1: ruleClassType
                    {
                     before(grammarAccess.getElementTypeAccess().getClassTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClassType_in_rule__ElementType__Alternatives1096);
                    ruleClassType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getClassTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:552:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) | ( 'float' ) | ( 'char' ) | ( 'byte' ) | ( 'short' ) | ( 'long' ) | ( 'double' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:556:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) | ( 'float' ) | ( 'char' ) | ( 'byte' ) | ( 'short' ) | ( 'long' ) | ( 'double' ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:557:1: ( 'string' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:557:1: ( 'string' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:558:1: 'string'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_01129); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:565:6: ( 'int' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:565:6: ( 'int' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:566:1: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_01149); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:573:6: ( 'boolean' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:573:6: ( 'boolean' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:574:1: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01169); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:581:6: ( 'float' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:581:6: ( 'float' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:582:1: 'float'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameFloatKeyword_0_3()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01189); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameFloatKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:589:6: ( 'char' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:589:6: ( 'char' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:590:1: 'char'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCharKeyword_0_4()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01209); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCharKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:597:6: ( 'byte' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:597:6: ( 'byte' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:598:1: 'byte'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameByteKeyword_0_5()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__BasicType__TypeNameAlternatives_01229); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameByteKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:605:6: ( 'short' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:605:6: ( 'short' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:606:1: 'short'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameShortKeyword_0_6()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BasicType__TypeNameAlternatives_01249); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameShortKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:613:6: ( 'long' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:613:6: ( 'long' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:614:1: 'long'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameLongKeyword_0_7()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BasicType__TypeNameAlternatives_01269); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameLongKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:621:6: ( 'double' )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:621:6: ( 'double' )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:622:1: 'double'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDoubleKeyword_0_8()); 
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BasicType__TypeNameAlternatives_01289); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDoubleKeyword_0_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Refactoring__Alternatives"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:634:1: rule__Refactoring__Alternatives : ( ( ruleRenameFeature ) | ( ruleMovingFeaturesBetweenObjects ) );
    public final void rule__Refactoring__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( ( ruleRenameFeature ) | ( ruleMovingFeaturesBetweenObjects ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:639:1: ( ruleRenameFeature )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:639:1: ( ruleRenameFeature )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:640:1: ruleRenameFeature
                    {
                     before(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_rule__Refactoring__Alternatives1323);
                    ruleRenameFeature();

                    state._fsp--;

                     after(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:645:6: ( ruleMovingFeaturesBetweenObjects )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:645:6: ( ruleMovingFeaturesBetweenObjects )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:646:1: ruleMovingFeaturesBetweenObjects
                    {
                     before(grammarAccess.getRefactoringAccess().getMovingFeaturesBetweenObjectsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMovingFeaturesBetweenObjects_in_rule__Refactoring__Alternatives1340);
                    ruleMovingFeaturesBetweenObjects();

                    state._fsp--;

                     after(grammarAccess.getRefactoringAccess().getMovingFeaturesBetweenObjectsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refactoring__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:658:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:662:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:663:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01370);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01373);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:670:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:674:1: ( ( 'model' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:675:1: ( 'model' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:675:1: ( 'model' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:676:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Model__Group__0__Impl1401); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:689:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:693:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:694:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11432);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11435);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:701:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:705:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:706:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:706:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:707:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:708:1: ( rule__Model__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:708:2: rule__Model__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1462);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:718:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:722:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:723:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21492);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21495);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:730:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:734:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:735:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:735:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:736:1: ( rule__Model__ImportsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:737:1: ( rule__Model__ImportsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:737:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl1522);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:747:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:751:1: ( rule__Model__Group__3__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:752:2: rule__Model__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31553);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:758:1: rule__Model__Group__3__Impl : ( ( rule__Model__ContainsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:762:1: ( ( ( rule__Model__ContainsAssignment_3 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:763:1: ( ( rule__Model__ContainsAssignment_3 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:763:1: ( ( rule__Model__ContainsAssignment_3 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:764:1: ( rule__Model__ContainsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getContainsAssignment_3()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:765:1: ( rule__Model__ContainsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==27||LA6_0==37) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:765:2: rule__Model__ContainsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__ContainsAssignment_3_in_rule__Model__Group__3__Impl1580);
            	    rule__Model__ContainsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContainsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:783:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:787:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:788:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01619);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01622);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:795:1: rule__Import__Group__0__Impl : ( 'importing' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:799:1: ( ( 'importing' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:800:1: ( 'importing' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:800:1: ( 'importing' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:801:1: 'importing'
            {
             before(grammarAccess.getImportAccess().getImportingKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Import__Group__0__Impl1650); 
             after(grammarAccess.getImportAccess().getImportingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:814:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:818:1: ( rule__Import__Group__1__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:819:2: rule__Import__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11681);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:825:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:829:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:830:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:830:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:831:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:832:1: ( rule__Import__ImportURIAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:832:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1708);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:846:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:850:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:851:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01742);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01745);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:858:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:862:1: ( ( 'Class' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:863:1: ( 'Class' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:863:1: ( 'Class' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:864:1: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class__Group__0__Impl1773); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:877:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:881:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:882:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11804);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11807);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:889:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:893:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:894:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:894:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:895:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:896:1: ( rule__Class__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:896:2: rule__Class__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1834);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:906:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:910:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:911:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21864);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21867);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:918:1: rule__Class__Group__2__Impl : ( '{' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:922:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:923:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:923:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:924:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Class__Group__2__Impl1895); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:937:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:941:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:942:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31926);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31929);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:949:1: rule__Class__Group__3__Impl : ( ( rule__Class__AttributesAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:953:1: ( ( ( rule__Class__AttributesAssignment_3 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:954:1: ( ( rule__Class__AttributesAssignment_3 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:954:1: ( ( rule__Class__AttributesAssignment_3 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:955:1: ( rule__Class__AttributesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_3()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:956:1: ( rule__Class__AttributesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:956:2: rule__Class__AttributesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class__AttributesAssignment_3_in_rule__Class__Group__3__Impl1956);
            	    rule__Class__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:966:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:970:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:971:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41987);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41990);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:978:1: rule__Class__Group__4__Impl : ( ( rule__Class__MethodsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:982:1: ( ( ( rule__Class__MethodsAssignment_4 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:983:1: ( ( rule__Class__MethodsAssignment_4 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:983:1: ( ( rule__Class__MethodsAssignment_4 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:984:1: ( rule__Class__MethodsAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_4()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:985:1: ( rule__Class__MethodsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:985:2: rule__Class__MethodsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class__MethodsAssignment_4_in_rule__Class__Group__4__Impl2017);
            	    rule__Class__MethodsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMethodsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:995:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:999:1: ( rule__Class__Group__5__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1000:2: rule__Class__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52048);
            rule__Class__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1006:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1010:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1012:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Class__Group__5__Impl2076); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1037:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1041:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1042:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02119);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02122);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1049:1: rule__Attribute__Group__0__Impl : ( '@' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1053:1: ( ( '@' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1054:1: ( '@' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1054:1: ( '@' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Attribute__Group__0__Impl2150); 
             after(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1068:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1072:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1073:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12181);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12184);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ElementTypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1084:1: ( ( ( rule__Attribute__ElementTypeAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1085:1: ( ( rule__Attribute__ElementTypeAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1085:1: ( ( rule__Attribute__ElementTypeAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1086:1: ( rule__Attribute__ElementTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getElementTypeAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1087:1: ( rule__Attribute__ElementTypeAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1087:2: rule__Attribute__ElementTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__ElementTypeAssignment_1_in_rule__Attribute__Group__1__Impl2211);
            rule__Attribute__ElementTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getElementTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1097:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1101:1: ( rule__Attribute__Group__2__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1102:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22241);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1108:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1112:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1113:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1113:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1114:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1115:1: ( rule__Attribute__NameAssignment_2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1115:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2268);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1131:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1135:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1136:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02304);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02307);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1143:1: rule__Method__Group__0__Impl : ( 'def' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1147:1: ( ( 'def' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1148:1: ( 'def' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1148:1: ( 'def' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1149:1: 'def'
            {
             before(grammarAccess.getMethodAccess().getDefKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Method__Group__0__Impl2335); 
             after(grammarAccess.getMethodAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1162:1: rule__Method__Group__1 : rule__Method__Group__1__Impl ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1166:1: ( rule__Method__Group__1__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1167:2: rule__Method__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12366);
            rule__Method__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1173:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1177:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1178:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1178:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1179:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1180:1: ( rule__Method__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1180:2: rule__Method__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl2393);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__RenameFeature__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1194:1: rule__RenameFeature__Group__0 : rule__RenameFeature__Group__0__Impl rule__RenameFeature__Group__1 ;
    public final void rule__RenameFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1198:1: ( rule__RenameFeature__Group__0__Impl rule__RenameFeature__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1199:2: rule__RenameFeature__Group__0__Impl rule__RenameFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__0__Impl_in_rule__RenameFeature__Group__02427);
            rule__RenameFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__1_in_rule__RenameFeature__Group__02430);
            rule__RenameFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__0"


    // $ANTLR start "rule__RenameFeature__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1206:1: rule__RenameFeature__Group__0__Impl : ( 'Rename_Feature' ) ;
    public final void rule__RenameFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1210:1: ( ( 'Rename_Feature' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1211:1: ( 'Rename_Feature' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1211:1: ( 'Rename_Feature' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1212:1: 'Rename_Feature'
            {
             before(grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RenameFeature__Group__0__Impl2458); 
             after(grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__0__Impl"


    // $ANTLR start "rule__RenameFeature__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1225:1: rule__RenameFeature__Group__1 : rule__RenameFeature__Group__1__Impl rule__RenameFeature__Group__2 ;
    public final void rule__RenameFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1229:1: ( rule__RenameFeature__Group__1__Impl rule__RenameFeature__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1230:2: rule__RenameFeature__Group__1__Impl rule__RenameFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__1__Impl_in_rule__RenameFeature__Group__12489);
            rule__RenameFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__2_in_rule__RenameFeature__Group__12492);
            rule__RenameFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__1"


    // $ANTLR start "rule__RenameFeature__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1237:1: rule__RenameFeature__Group__1__Impl : ( ( rule__RenameFeature__NameAssignment_1 ) ) ;
    public final void rule__RenameFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1241:1: ( ( ( rule__RenameFeature__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1242:1: ( ( rule__RenameFeature__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1242:1: ( ( rule__RenameFeature__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1243:1: ( rule__RenameFeature__NameAssignment_1 )
            {
             before(grammarAccess.getRenameFeatureAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1244:1: ( rule__RenameFeature__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1244:2: rule__RenameFeature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__NameAssignment_1_in_rule__RenameFeature__Group__1__Impl2519);
            rule__RenameFeature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__1__Impl"


    // $ANTLR start "rule__RenameFeature__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1254:1: rule__RenameFeature__Group__2 : rule__RenameFeature__Group__2__Impl rule__RenameFeature__Group__3 ;
    public final void rule__RenameFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1258:1: ( rule__RenameFeature__Group__2__Impl rule__RenameFeature__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1259:2: rule__RenameFeature__Group__2__Impl rule__RenameFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__2__Impl_in_rule__RenameFeature__Group__22549);
            rule__RenameFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__3_in_rule__RenameFeature__Group__22552);
            rule__RenameFeature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__2"


    // $ANTLR start "rule__RenameFeature__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1266:1: rule__RenameFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__RenameFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1270:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1271:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1271:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1272:1: '{'
            {
             before(grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RenameFeature__Group__2__Impl2580); 
             after(grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__2__Impl"


    // $ANTLR start "rule__RenameFeature__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1285:1: rule__RenameFeature__Group__3 : rule__RenameFeature__Group__3__Impl rule__RenameFeature__Group__4 ;
    public final void rule__RenameFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1289:1: ( rule__RenameFeature__Group__3__Impl rule__RenameFeature__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1290:2: rule__RenameFeature__Group__3__Impl rule__RenameFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__3__Impl_in_rule__RenameFeature__Group__32611);
            rule__RenameFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__4_in_rule__RenameFeature__Group__32614);
            rule__RenameFeature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__3"


    // $ANTLR start "rule__RenameFeature__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1297:1: rule__RenameFeature__Group__3__Impl : ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* ) ;
    public final void rule__RenameFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1301:1: ( ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1302:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1302:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1303:1: ( rule__RenameFeature__AllRefactoringsAssignment_3 )*
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_3()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1304:1: ( rule__RenameFeature__AllRefactoringsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1304:2: rule__RenameFeature__AllRefactoringsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_3_in_rule__RenameFeature__Group__3__Impl2641);
            	    rule__RenameFeature__AllRefactoringsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__3__Impl"


    // $ANTLR start "rule__RenameFeature__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1314:1: rule__RenameFeature__Group__4 : rule__RenameFeature__Group__4__Impl rule__RenameFeature__Group__5 ;
    public final void rule__RenameFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1318:1: ( rule__RenameFeature__Group__4__Impl rule__RenameFeature__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1319:2: rule__RenameFeature__Group__4__Impl rule__RenameFeature__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__4__Impl_in_rule__RenameFeature__Group__42672);
            rule__RenameFeature__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__5_in_rule__RenameFeature__Group__42675);
            rule__RenameFeature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__4"


    // $ANTLR start "rule__RenameFeature__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: rule__RenameFeature__Group__4__Impl : ( ( rule__RenameFeature__AllRefactoringsAssignment_4 )* ) ;
    public final void rule__RenameFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1330:1: ( ( ( rule__RenameFeature__AllRefactoringsAssignment_4 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1331:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_4 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1331:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_4 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1332:1: ( rule__RenameFeature__AllRefactoringsAssignment_4 )*
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_4()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1333:1: ( rule__RenameFeature__AllRefactoringsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1333:2: rule__RenameFeature__AllRefactoringsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_4_in_rule__RenameFeature__Group__4__Impl2702);
            	    rule__RenameFeature__AllRefactoringsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__4__Impl"


    // $ANTLR start "rule__RenameFeature__Group__5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1343:1: rule__RenameFeature__Group__5 : rule__RenameFeature__Group__5__Impl rule__RenameFeature__Group__6 ;
    public final void rule__RenameFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1347:1: ( rule__RenameFeature__Group__5__Impl rule__RenameFeature__Group__6 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1348:2: rule__RenameFeature__Group__5__Impl rule__RenameFeature__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__5__Impl_in_rule__RenameFeature__Group__52733);
            rule__RenameFeature__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__6_in_rule__RenameFeature__Group__52736);
            rule__RenameFeature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__5"


    // $ANTLR start "rule__RenameFeature__Group__5__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1355:1: rule__RenameFeature__Group__5__Impl : ( ( rule__RenameFeature__AllRefactoringsAssignment_5 )* ) ;
    public final void rule__RenameFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1359:1: ( ( ( rule__RenameFeature__AllRefactoringsAssignment_5 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1360:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_5 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1360:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_5 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1361:1: ( rule__RenameFeature__AllRefactoringsAssignment_5 )*
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_5()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1362:1: ( rule__RenameFeature__AllRefactoringsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1362:2: rule__RenameFeature__AllRefactoringsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_5_in_rule__RenameFeature__Group__5__Impl2763);
            	    rule__RenameFeature__AllRefactoringsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__5__Impl"


    // $ANTLR start "rule__RenameFeature__Group__6"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: rule__RenameFeature__Group__6 : rule__RenameFeature__Group__6__Impl ;
    public final void rule__RenameFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1376:1: ( rule__RenameFeature__Group__6__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1377:2: rule__RenameFeature__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__6__Impl_in_rule__RenameFeature__Group__62794);
            rule__RenameFeature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__6"


    // $ANTLR start "rule__RenameFeature__Group__6__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1383:1: rule__RenameFeature__Group__6__Impl : ( '}' ) ;
    public final void rule__RenameFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1387:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1388:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1388:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1389:1: '}'
            {
             before(grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RenameFeature__Group__6__Impl2822); 
             after(grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__Group__6__Impl"


    // $ANTLR start "rule__RenameClass__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1416:1: rule__RenameClass__Group__0 : rule__RenameClass__Group__0__Impl rule__RenameClass__Group__1 ;
    public final void rule__RenameClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1420:1: ( rule__RenameClass__Group__0__Impl rule__RenameClass__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1421:2: rule__RenameClass__Group__0__Impl rule__RenameClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__0__Impl_in_rule__RenameClass__Group__02867);
            rule__RenameClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__1_in_rule__RenameClass__Group__02870);
            rule__RenameClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__0"


    // $ANTLR start "rule__RenameClass__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1428:1: rule__RenameClass__Group__0__Impl : ( 'Refactoring_RenameClass' ) ;
    public final void rule__RenameClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1432:1: ( ( 'Refactoring_RenameClass' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1433:1: ( 'Refactoring_RenameClass' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1433:1: ( 'Refactoring_RenameClass' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1434:1: 'Refactoring_RenameClass'
            {
             before(grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__RenameClass__Group__0__Impl2898); 
             after(grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__0__Impl"


    // $ANTLR start "rule__RenameClass__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1447:1: rule__RenameClass__Group__1 : rule__RenameClass__Group__1__Impl rule__RenameClass__Group__2 ;
    public final void rule__RenameClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1451:1: ( rule__RenameClass__Group__1__Impl rule__RenameClass__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1452:2: rule__RenameClass__Group__1__Impl rule__RenameClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__1__Impl_in_rule__RenameClass__Group__12929);
            rule__RenameClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__2_in_rule__RenameClass__Group__12932);
            rule__RenameClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__1"


    // $ANTLR start "rule__RenameClass__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1459:1: rule__RenameClass__Group__1__Impl : ( ( rule__RenameClass__NameAssignment_1 ) ) ;
    public final void rule__RenameClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1463:1: ( ( ( rule__RenameClass__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1464:1: ( ( rule__RenameClass__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1464:1: ( ( rule__RenameClass__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1465:1: ( rule__RenameClass__NameAssignment_1 )
            {
             before(grammarAccess.getRenameClassAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1466:1: ( rule__RenameClass__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1466:2: rule__RenameClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__NameAssignment_1_in_rule__RenameClass__Group__1__Impl2959);
            rule__RenameClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__1__Impl"


    // $ANTLR start "rule__RenameClass__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1476:1: rule__RenameClass__Group__2 : rule__RenameClass__Group__2__Impl rule__RenameClass__Group__3 ;
    public final void rule__RenameClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1480:1: ( rule__RenameClass__Group__2__Impl rule__RenameClass__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1481:2: rule__RenameClass__Group__2__Impl rule__RenameClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__2__Impl_in_rule__RenameClass__Group__22989);
            rule__RenameClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__3_in_rule__RenameClass__Group__22992);
            rule__RenameClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__2"


    // $ANTLR start "rule__RenameClass__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1488:1: rule__RenameClass__Group__2__Impl : ( '{' ) ;
    public final void rule__RenameClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1492:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1493:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1493:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1494:1: '{'
            {
             before(grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RenameClass__Group__2__Impl3020); 
             after(grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__2__Impl"


    // $ANTLR start "rule__RenameClass__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1507:1: rule__RenameClass__Group__3 : rule__RenameClass__Group__3__Impl rule__RenameClass__Group__4 ;
    public final void rule__RenameClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1511:1: ( rule__RenameClass__Group__3__Impl rule__RenameClass__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1512:2: rule__RenameClass__Group__3__Impl rule__RenameClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__3__Impl_in_rule__RenameClass__Group__33051);
            rule__RenameClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__4_in_rule__RenameClass__Group__33054);
            rule__RenameClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__3"


    // $ANTLR start "rule__RenameClass__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1519:1: rule__RenameClass__Group__3__Impl : ( 'classToBeRename' ) ;
    public final void rule__RenameClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1523:1: ( ( 'classToBeRename' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1524:1: ( 'classToBeRename' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1524:1: ( 'classToBeRename' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1525:1: 'classToBeRename'
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RenameClass__Group__3__Impl3082); 
             after(grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__3__Impl"


    // $ANTLR start "rule__RenameClass__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1538:1: rule__RenameClass__Group__4 : rule__RenameClass__Group__4__Impl rule__RenameClass__Group__5 ;
    public final void rule__RenameClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1542:1: ( rule__RenameClass__Group__4__Impl rule__RenameClass__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1543:2: rule__RenameClass__Group__4__Impl rule__RenameClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__4__Impl_in_rule__RenameClass__Group__43113);
            rule__RenameClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__5_in_rule__RenameClass__Group__43116);
            rule__RenameClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__4"


    // $ANTLR start "rule__RenameClass__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1550:1: rule__RenameClass__Group__4__Impl : ( ':' ) ;
    public final void rule__RenameClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1554:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1555:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1555:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1556:1: ':'
            {
             before(grammarAccess.getRenameClassAccess().getColonKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameClass__Group__4__Impl3144); 
             after(grammarAccess.getRenameClassAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__4__Impl"


    // $ANTLR start "rule__RenameClass__Group__5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1569:1: rule__RenameClass__Group__5 : rule__RenameClass__Group__5__Impl rule__RenameClass__Group__6 ;
    public final void rule__RenameClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1573:1: ( rule__RenameClass__Group__5__Impl rule__RenameClass__Group__6 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1574:2: rule__RenameClass__Group__5__Impl rule__RenameClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__5__Impl_in_rule__RenameClass__Group__53175);
            rule__RenameClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__6_in_rule__RenameClass__Group__53178);
            rule__RenameClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__5"


    // $ANTLR start "rule__RenameClass__Group__5__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1581:1: rule__RenameClass__Group__5__Impl : ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) ) ;
    public final void rule__RenameClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1585:1: ( ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1587:1: ( rule__RenameClass__ClassToBeRenameAssignment_5 )
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameAssignment_5()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1588:1: ( rule__RenameClass__ClassToBeRenameAssignment_5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1588:2: rule__RenameClass__ClassToBeRenameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__ClassToBeRenameAssignment_5_in_rule__RenameClass__Group__5__Impl3205);
            rule__RenameClass__ClassToBeRenameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRenameClassAccess().getClassToBeRenameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__5__Impl"


    // $ANTLR start "rule__RenameClass__Group__6"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1598:1: rule__RenameClass__Group__6 : rule__RenameClass__Group__6__Impl rule__RenameClass__Group__7 ;
    public final void rule__RenameClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1602:1: ( rule__RenameClass__Group__6__Impl rule__RenameClass__Group__7 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1603:2: rule__RenameClass__Group__6__Impl rule__RenameClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__6__Impl_in_rule__RenameClass__Group__63235);
            rule__RenameClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__7_in_rule__RenameClass__Group__63238);
            rule__RenameClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__6"


    // $ANTLR start "rule__RenameClass__Group__6__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1610:1: rule__RenameClass__Group__6__Impl : ( 'newName' ) ;
    public final void rule__RenameClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1614:1: ( ( 'newName' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: ( 'newName' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: ( 'newName' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1616:1: 'newName'
            {
             before(grammarAccess.getRenameClassAccess().getNewNameKeyword_6()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RenameClass__Group__6__Impl3266); 
             after(grammarAccess.getRenameClassAccess().getNewNameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__6__Impl"


    // $ANTLR start "rule__RenameClass__Group__7"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1629:1: rule__RenameClass__Group__7 : rule__RenameClass__Group__7__Impl rule__RenameClass__Group__8 ;
    public final void rule__RenameClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1633:1: ( rule__RenameClass__Group__7__Impl rule__RenameClass__Group__8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1634:2: rule__RenameClass__Group__7__Impl rule__RenameClass__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__7__Impl_in_rule__RenameClass__Group__73297);
            rule__RenameClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__8_in_rule__RenameClass__Group__73300);
            rule__RenameClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__7"


    // $ANTLR start "rule__RenameClass__Group__7__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1641:1: rule__RenameClass__Group__7__Impl : ( ':' ) ;
    public final void rule__RenameClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1645:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1646:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1646:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1647:1: ':'
            {
             before(grammarAccess.getRenameClassAccess().getColonKeyword_7()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameClass__Group__7__Impl3328); 
             after(grammarAccess.getRenameClassAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__7__Impl"


    // $ANTLR start "rule__RenameClass__Group__8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1660:1: rule__RenameClass__Group__8 : rule__RenameClass__Group__8__Impl rule__RenameClass__Group__9 ;
    public final void rule__RenameClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1664:1: ( rule__RenameClass__Group__8__Impl rule__RenameClass__Group__9 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1665:2: rule__RenameClass__Group__8__Impl rule__RenameClass__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__8__Impl_in_rule__RenameClass__Group__83359);
            rule__RenameClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__9_in_rule__RenameClass__Group__83362);
            rule__RenameClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__8"


    // $ANTLR start "rule__RenameClass__Group__8__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: rule__RenameClass__Group__8__Impl : ( ( rule__RenameClass__NewNameAssignment_8 ) ) ;
    public final void rule__RenameClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1676:1: ( ( ( rule__RenameClass__NewNameAssignment_8 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1677:1: ( ( rule__RenameClass__NewNameAssignment_8 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1677:1: ( ( rule__RenameClass__NewNameAssignment_8 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1678:1: ( rule__RenameClass__NewNameAssignment_8 )
            {
             before(grammarAccess.getRenameClassAccess().getNewNameAssignment_8()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1679:1: ( rule__RenameClass__NewNameAssignment_8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1679:2: rule__RenameClass__NewNameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__NewNameAssignment_8_in_rule__RenameClass__Group__8__Impl3389);
            rule__RenameClass__NewNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRenameClassAccess().getNewNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__8__Impl"


    // $ANTLR start "rule__RenameClass__Group__9"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1689:1: rule__RenameClass__Group__9 : rule__RenameClass__Group__9__Impl ;
    public final void rule__RenameClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1693:1: ( rule__RenameClass__Group__9__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1694:2: rule__RenameClass__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__9__Impl_in_rule__RenameClass__Group__93419);
            rule__RenameClass__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__9"


    // $ANTLR start "rule__RenameClass__Group__9__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1700:1: rule__RenameClass__Group__9__Impl : ( '}' ) ;
    public final void rule__RenameClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1704:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1705:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1705:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1706:1: '}'
            {
             before(grammarAccess.getRenameClassAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RenameClass__Group__9__Impl3447); 
             after(grammarAccess.getRenameClassAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__Group__9__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1739:1: rule__RenameAttribute__Group__0 : rule__RenameAttribute__Group__0__Impl rule__RenameAttribute__Group__1 ;
    public final void rule__RenameAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1743:1: ( rule__RenameAttribute__Group__0__Impl rule__RenameAttribute__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1744:2: rule__RenameAttribute__Group__0__Impl rule__RenameAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__0__Impl_in_rule__RenameAttribute__Group__03498);
            rule__RenameAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__1_in_rule__RenameAttribute__Group__03501);
            rule__RenameAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__0"


    // $ANTLR start "rule__RenameAttribute__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1751:1: rule__RenameAttribute__Group__0__Impl : ( 'Refactiong_RenameAttribute' ) ;
    public final void rule__RenameAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1755:1: ( ( 'Refactiong_RenameAttribute' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1756:1: ( 'Refactiong_RenameAttribute' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1756:1: ( 'Refactiong_RenameAttribute' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1757:1: 'Refactiong_RenameAttribute'
            {
             before(grammarAccess.getRenameAttributeAccess().getRefactiong_RenameAttributeKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RenameAttribute__Group__0__Impl3529); 
             after(grammarAccess.getRenameAttributeAccess().getRefactiong_RenameAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__0__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1770:1: rule__RenameAttribute__Group__1 : rule__RenameAttribute__Group__1__Impl rule__RenameAttribute__Group__2 ;
    public final void rule__RenameAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1774:1: ( rule__RenameAttribute__Group__1__Impl rule__RenameAttribute__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1775:2: rule__RenameAttribute__Group__1__Impl rule__RenameAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__1__Impl_in_rule__RenameAttribute__Group__13560);
            rule__RenameAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__2_in_rule__RenameAttribute__Group__13563);
            rule__RenameAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__1"


    // $ANTLR start "rule__RenameAttribute__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1782:1: rule__RenameAttribute__Group__1__Impl : ( ( rule__RenameAttribute__NameAssignment_1 ) ) ;
    public final void rule__RenameAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1786:1: ( ( ( rule__RenameAttribute__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1787:1: ( ( rule__RenameAttribute__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1787:1: ( ( rule__RenameAttribute__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1788:1: ( rule__RenameAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getRenameAttributeAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1789:1: ( rule__RenameAttribute__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1789:2: rule__RenameAttribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__NameAssignment_1_in_rule__RenameAttribute__Group__1__Impl3590);
            rule__RenameAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__1__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1799:1: rule__RenameAttribute__Group__2 : rule__RenameAttribute__Group__2__Impl rule__RenameAttribute__Group__3 ;
    public final void rule__RenameAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1803:1: ( rule__RenameAttribute__Group__2__Impl rule__RenameAttribute__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1804:2: rule__RenameAttribute__Group__2__Impl rule__RenameAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__2__Impl_in_rule__RenameAttribute__Group__23620);
            rule__RenameAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__3_in_rule__RenameAttribute__Group__23623);
            rule__RenameAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__2"


    // $ANTLR start "rule__RenameAttribute__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1811:1: rule__RenameAttribute__Group__2__Impl : ( '{' ) ;
    public final void rule__RenameAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1815:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1816:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1816:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1817:1: '{'
            {
             before(grammarAccess.getRenameAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RenameAttribute__Group__2__Impl3651); 
             after(grammarAccess.getRenameAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__2__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1830:1: rule__RenameAttribute__Group__3 : rule__RenameAttribute__Group__3__Impl rule__RenameAttribute__Group__4 ;
    public final void rule__RenameAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1834:1: ( rule__RenameAttribute__Group__3__Impl rule__RenameAttribute__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1835:2: rule__RenameAttribute__Group__3__Impl rule__RenameAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__3__Impl_in_rule__RenameAttribute__Group__33682);
            rule__RenameAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__4_in_rule__RenameAttribute__Group__33685);
            rule__RenameAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__3"


    // $ANTLR start "rule__RenameAttribute__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1842:1: rule__RenameAttribute__Group__3__Impl : ( 'sourceClass' ) ;
    public final void rule__RenameAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1846:1: ( ( 'sourceClass' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1847:1: ( 'sourceClass' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1847:1: ( 'sourceClass' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1848:1: 'sourceClass'
            {
             before(grammarAccess.getRenameAttributeAccess().getSourceClassKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RenameAttribute__Group__3__Impl3713); 
             after(grammarAccess.getRenameAttributeAccess().getSourceClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__3__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1861:1: rule__RenameAttribute__Group__4 : rule__RenameAttribute__Group__4__Impl rule__RenameAttribute__Group__5 ;
    public final void rule__RenameAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1865:1: ( rule__RenameAttribute__Group__4__Impl rule__RenameAttribute__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1866:2: rule__RenameAttribute__Group__4__Impl rule__RenameAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__4__Impl_in_rule__RenameAttribute__Group__43744);
            rule__RenameAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__5_in_rule__RenameAttribute__Group__43747);
            rule__RenameAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__4"


    // $ANTLR start "rule__RenameAttribute__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1873:1: rule__RenameAttribute__Group__4__Impl : ( ':' ) ;
    public final void rule__RenameAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1877:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1879:1: ':'
            {
             before(grammarAccess.getRenameAttributeAccess().getColonKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameAttribute__Group__4__Impl3775); 
             after(grammarAccess.getRenameAttributeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__4__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1892:1: rule__RenameAttribute__Group__5 : rule__RenameAttribute__Group__5__Impl rule__RenameAttribute__Group__6 ;
    public final void rule__RenameAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1896:1: ( rule__RenameAttribute__Group__5__Impl rule__RenameAttribute__Group__6 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1897:2: rule__RenameAttribute__Group__5__Impl rule__RenameAttribute__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__5__Impl_in_rule__RenameAttribute__Group__53806);
            rule__RenameAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__6_in_rule__RenameAttribute__Group__53809);
            rule__RenameAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__5"


    // $ANTLR start "rule__RenameAttribute__Group__5__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1904:1: rule__RenameAttribute__Group__5__Impl : ( ( rule__RenameAttribute__SourceClassAssignment_5 ) ) ;
    public final void rule__RenameAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1908:1: ( ( ( rule__RenameAttribute__SourceClassAssignment_5 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: ( ( rule__RenameAttribute__SourceClassAssignment_5 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: ( ( rule__RenameAttribute__SourceClassAssignment_5 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1910:1: ( rule__RenameAttribute__SourceClassAssignment_5 )
            {
             before(grammarAccess.getRenameAttributeAccess().getSourceClassAssignment_5()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1911:1: ( rule__RenameAttribute__SourceClassAssignment_5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1911:2: rule__RenameAttribute__SourceClassAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__SourceClassAssignment_5_in_rule__RenameAttribute__Group__5__Impl3836);
            rule__RenameAttribute__SourceClassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRenameAttributeAccess().getSourceClassAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__5__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__6"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1921:1: rule__RenameAttribute__Group__6 : rule__RenameAttribute__Group__6__Impl rule__RenameAttribute__Group__7 ;
    public final void rule__RenameAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1925:1: ( rule__RenameAttribute__Group__6__Impl rule__RenameAttribute__Group__7 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1926:2: rule__RenameAttribute__Group__6__Impl rule__RenameAttribute__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__6__Impl_in_rule__RenameAttribute__Group__63866);
            rule__RenameAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__7_in_rule__RenameAttribute__Group__63869);
            rule__RenameAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__6"


    // $ANTLR start "rule__RenameAttribute__Group__6__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1933:1: rule__RenameAttribute__Group__6__Impl : ( 'attributeToBeRename' ) ;
    public final void rule__RenameAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1937:1: ( ( 'attributeToBeRename' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1938:1: ( 'attributeToBeRename' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1938:1: ( 'attributeToBeRename' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1939:1: 'attributeToBeRename'
            {
             before(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__RenameAttribute__Group__6__Impl3897); 
             after(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__6__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__7"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1952:1: rule__RenameAttribute__Group__7 : rule__RenameAttribute__Group__7__Impl rule__RenameAttribute__Group__8 ;
    public final void rule__RenameAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1956:1: ( rule__RenameAttribute__Group__7__Impl rule__RenameAttribute__Group__8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1957:2: rule__RenameAttribute__Group__7__Impl rule__RenameAttribute__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__7__Impl_in_rule__RenameAttribute__Group__73928);
            rule__RenameAttribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__8_in_rule__RenameAttribute__Group__73931);
            rule__RenameAttribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__7"


    // $ANTLR start "rule__RenameAttribute__Group__7__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1964:1: rule__RenameAttribute__Group__7__Impl : ( ':' ) ;
    public final void rule__RenameAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1968:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1969:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1969:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1970:1: ':'
            {
             before(grammarAccess.getRenameAttributeAccess().getColonKeyword_7()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameAttribute__Group__7__Impl3959); 
             after(grammarAccess.getRenameAttributeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__7__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1983:1: rule__RenameAttribute__Group__8 : rule__RenameAttribute__Group__8__Impl rule__RenameAttribute__Group__9 ;
    public final void rule__RenameAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1987:1: ( rule__RenameAttribute__Group__8__Impl rule__RenameAttribute__Group__9 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1988:2: rule__RenameAttribute__Group__8__Impl rule__RenameAttribute__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__8__Impl_in_rule__RenameAttribute__Group__83990);
            rule__RenameAttribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__9_in_rule__RenameAttribute__Group__83993);
            rule__RenameAttribute__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__8"


    // $ANTLR start "rule__RenameAttribute__Group__8__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1995:1: rule__RenameAttribute__Group__8__Impl : ( ( rule__RenameAttribute__AttributeToBeRenameAssignment_8 ) ) ;
    public final void rule__RenameAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1999:1: ( ( ( rule__RenameAttribute__AttributeToBeRenameAssignment_8 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2000:1: ( ( rule__RenameAttribute__AttributeToBeRenameAssignment_8 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2000:1: ( ( rule__RenameAttribute__AttributeToBeRenameAssignment_8 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2001:1: ( rule__RenameAttribute__AttributeToBeRenameAssignment_8 )
            {
             before(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAssignment_8()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2002:1: ( rule__RenameAttribute__AttributeToBeRenameAssignment_8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2002:2: rule__RenameAttribute__AttributeToBeRenameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__AttributeToBeRenameAssignment_8_in_rule__RenameAttribute__Group__8__Impl4020);
            rule__RenameAttribute__AttributeToBeRenameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__8__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__9"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2012:1: rule__RenameAttribute__Group__9 : rule__RenameAttribute__Group__9__Impl rule__RenameAttribute__Group__10 ;
    public final void rule__RenameAttribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2016:1: ( rule__RenameAttribute__Group__9__Impl rule__RenameAttribute__Group__10 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2017:2: rule__RenameAttribute__Group__9__Impl rule__RenameAttribute__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__9__Impl_in_rule__RenameAttribute__Group__94050);
            rule__RenameAttribute__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__10_in_rule__RenameAttribute__Group__94053);
            rule__RenameAttribute__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__9"


    // $ANTLR start "rule__RenameAttribute__Group__9__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2024:1: rule__RenameAttribute__Group__9__Impl : ( 'newName' ) ;
    public final void rule__RenameAttribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2028:1: ( ( 'newName' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2029:1: ( 'newName' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2029:1: ( 'newName' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2030:1: 'newName'
            {
             before(grammarAccess.getRenameAttributeAccess().getNewNameKeyword_9()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RenameAttribute__Group__9__Impl4081); 
             after(grammarAccess.getRenameAttributeAccess().getNewNameKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__9__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__10"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2043:1: rule__RenameAttribute__Group__10 : rule__RenameAttribute__Group__10__Impl rule__RenameAttribute__Group__11 ;
    public final void rule__RenameAttribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2047:1: ( rule__RenameAttribute__Group__10__Impl rule__RenameAttribute__Group__11 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2048:2: rule__RenameAttribute__Group__10__Impl rule__RenameAttribute__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__10__Impl_in_rule__RenameAttribute__Group__104112);
            rule__RenameAttribute__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__11_in_rule__RenameAttribute__Group__104115);
            rule__RenameAttribute__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__10"


    // $ANTLR start "rule__RenameAttribute__Group__10__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2055:1: rule__RenameAttribute__Group__10__Impl : ( ':' ) ;
    public final void rule__RenameAttribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2059:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2060:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2060:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2061:1: ':'
            {
             before(grammarAccess.getRenameAttributeAccess().getColonKeyword_10()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameAttribute__Group__10__Impl4143); 
             after(grammarAccess.getRenameAttributeAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__10__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__11"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2074:1: rule__RenameAttribute__Group__11 : rule__RenameAttribute__Group__11__Impl rule__RenameAttribute__Group__12 ;
    public final void rule__RenameAttribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2078:1: ( rule__RenameAttribute__Group__11__Impl rule__RenameAttribute__Group__12 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2079:2: rule__RenameAttribute__Group__11__Impl rule__RenameAttribute__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__11__Impl_in_rule__RenameAttribute__Group__114174);
            rule__RenameAttribute__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__12_in_rule__RenameAttribute__Group__114177);
            rule__RenameAttribute__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__11"


    // $ANTLR start "rule__RenameAttribute__Group__11__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2086:1: rule__RenameAttribute__Group__11__Impl : ( ( rule__RenameAttribute__NewNameAssignment_11 ) ) ;
    public final void rule__RenameAttribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2090:1: ( ( ( rule__RenameAttribute__NewNameAssignment_11 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2091:1: ( ( rule__RenameAttribute__NewNameAssignment_11 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2091:1: ( ( rule__RenameAttribute__NewNameAssignment_11 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2092:1: ( rule__RenameAttribute__NewNameAssignment_11 )
            {
             before(grammarAccess.getRenameAttributeAccess().getNewNameAssignment_11()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2093:1: ( rule__RenameAttribute__NewNameAssignment_11 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2093:2: rule__RenameAttribute__NewNameAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__NewNameAssignment_11_in_rule__RenameAttribute__Group__11__Impl4204);
            rule__RenameAttribute__NewNameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRenameAttributeAccess().getNewNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__11__Impl"


    // $ANTLR start "rule__RenameAttribute__Group__12"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2103:1: rule__RenameAttribute__Group__12 : rule__RenameAttribute__Group__12__Impl ;
    public final void rule__RenameAttribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2107:1: ( rule__RenameAttribute__Group__12__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2108:2: rule__RenameAttribute__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameAttribute__Group__12__Impl_in_rule__RenameAttribute__Group__124234);
            rule__RenameAttribute__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__12"


    // $ANTLR start "rule__RenameAttribute__Group__12__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2114:1: rule__RenameAttribute__Group__12__Impl : ( '}' ) ;
    public final void rule__RenameAttribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2118:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2119:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2119:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2120:1: '}'
            {
             before(grammarAccess.getRenameAttributeAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RenameAttribute__Group__12__Impl4262); 
             after(grammarAccess.getRenameAttributeAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__Group__12__Impl"


    // $ANTLR start "rule__RenameMethod__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2159:1: rule__RenameMethod__Group__0 : rule__RenameMethod__Group__0__Impl rule__RenameMethod__Group__1 ;
    public final void rule__RenameMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2163:1: ( rule__RenameMethod__Group__0__Impl rule__RenameMethod__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2164:2: rule__RenameMethod__Group__0__Impl rule__RenameMethod__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__0__Impl_in_rule__RenameMethod__Group__04319);
            rule__RenameMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__1_in_rule__RenameMethod__Group__04322);
            rule__RenameMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__0"


    // $ANTLR start "rule__RenameMethod__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2171:1: rule__RenameMethod__Group__0__Impl : ( 'Refactoring_RenameMethod' ) ;
    public final void rule__RenameMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2175:1: ( ( 'Refactoring_RenameMethod' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2176:1: ( 'Refactoring_RenameMethod' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2176:1: ( 'Refactoring_RenameMethod' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2177:1: 'Refactoring_RenameMethod'
            {
             before(grammarAccess.getRenameMethodAccess().getRefactoring_RenameMethodKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__RenameMethod__Group__0__Impl4350); 
             after(grammarAccess.getRenameMethodAccess().getRefactoring_RenameMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__0__Impl"


    // $ANTLR start "rule__RenameMethod__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2190:1: rule__RenameMethod__Group__1 : rule__RenameMethod__Group__1__Impl rule__RenameMethod__Group__2 ;
    public final void rule__RenameMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2194:1: ( rule__RenameMethod__Group__1__Impl rule__RenameMethod__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2195:2: rule__RenameMethod__Group__1__Impl rule__RenameMethod__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__1__Impl_in_rule__RenameMethod__Group__14381);
            rule__RenameMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__2_in_rule__RenameMethod__Group__14384);
            rule__RenameMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__1"


    // $ANTLR start "rule__RenameMethod__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2202:1: rule__RenameMethod__Group__1__Impl : ( ( rule__RenameMethod__NameAssignment_1 ) ) ;
    public final void rule__RenameMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2206:1: ( ( ( rule__RenameMethod__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2207:1: ( ( rule__RenameMethod__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2207:1: ( ( rule__RenameMethod__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2208:1: ( rule__RenameMethod__NameAssignment_1 )
            {
             before(grammarAccess.getRenameMethodAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2209:1: ( rule__RenameMethod__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2209:2: rule__RenameMethod__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__NameAssignment_1_in_rule__RenameMethod__Group__1__Impl4411);
            rule__RenameMethod__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__1__Impl"


    // $ANTLR start "rule__RenameMethod__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2219:1: rule__RenameMethod__Group__2 : rule__RenameMethod__Group__2__Impl rule__RenameMethod__Group__3 ;
    public final void rule__RenameMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2223:1: ( rule__RenameMethod__Group__2__Impl rule__RenameMethod__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2224:2: rule__RenameMethod__Group__2__Impl rule__RenameMethod__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__2__Impl_in_rule__RenameMethod__Group__24441);
            rule__RenameMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__3_in_rule__RenameMethod__Group__24444);
            rule__RenameMethod__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__2"


    // $ANTLR start "rule__RenameMethod__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2231:1: rule__RenameMethod__Group__2__Impl : ( '{' ) ;
    public final void rule__RenameMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2235:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2236:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2236:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2237:1: '{'
            {
             before(grammarAccess.getRenameMethodAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RenameMethod__Group__2__Impl4472); 
             after(grammarAccess.getRenameMethodAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__2__Impl"


    // $ANTLR start "rule__RenameMethod__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2250:1: rule__RenameMethod__Group__3 : rule__RenameMethod__Group__3__Impl rule__RenameMethod__Group__4 ;
    public final void rule__RenameMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2254:1: ( rule__RenameMethod__Group__3__Impl rule__RenameMethod__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2255:2: rule__RenameMethod__Group__3__Impl rule__RenameMethod__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__3__Impl_in_rule__RenameMethod__Group__34503);
            rule__RenameMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__4_in_rule__RenameMethod__Group__34506);
            rule__RenameMethod__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__3"


    // $ANTLR start "rule__RenameMethod__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2262:1: rule__RenameMethod__Group__3__Impl : ( 'sourceClass' ) ;
    public final void rule__RenameMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2266:1: ( ( 'sourceClass' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2267:1: ( 'sourceClass' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2267:1: ( 'sourceClass' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2268:1: 'sourceClass'
            {
             before(grammarAccess.getRenameMethodAccess().getSourceClassKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RenameMethod__Group__3__Impl4534); 
             after(grammarAccess.getRenameMethodAccess().getSourceClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__3__Impl"


    // $ANTLR start "rule__RenameMethod__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2281:1: rule__RenameMethod__Group__4 : rule__RenameMethod__Group__4__Impl rule__RenameMethod__Group__5 ;
    public final void rule__RenameMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2285:1: ( rule__RenameMethod__Group__4__Impl rule__RenameMethod__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2286:2: rule__RenameMethod__Group__4__Impl rule__RenameMethod__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__4__Impl_in_rule__RenameMethod__Group__44565);
            rule__RenameMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__5_in_rule__RenameMethod__Group__44568);
            rule__RenameMethod__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__4"


    // $ANTLR start "rule__RenameMethod__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2293:1: rule__RenameMethod__Group__4__Impl : ( ':' ) ;
    public final void rule__RenameMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2297:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2298:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2298:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2299:1: ':'
            {
             before(grammarAccess.getRenameMethodAccess().getColonKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameMethod__Group__4__Impl4596); 
             after(grammarAccess.getRenameMethodAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__4__Impl"


    // $ANTLR start "rule__RenameMethod__Group__5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2312:1: rule__RenameMethod__Group__5 : rule__RenameMethod__Group__5__Impl rule__RenameMethod__Group__6 ;
    public final void rule__RenameMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( rule__RenameMethod__Group__5__Impl rule__RenameMethod__Group__6 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2317:2: rule__RenameMethod__Group__5__Impl rule__RenameMethod__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__5__Impl_in_rule__RenameMethod__Group__54627);
            rule__RenameMethod__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__6_in_rule__RenameMethod__Group__54630);
            rule__RenameMethod__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__5"


    // $ANTLR start "rule__RenameMethod__Group__5__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2324:1: rule__RenameMethod__Group__5__Impl : ( ( rule__RenameMethod__SourceClassAssignment_5 ) ) ;
    public final void rule__RenameMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2328:1: ( ( ( rule__RenameMethod__SourceClassAssignment_5 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2329:1: ( ( rule__RenameMethod__SourceClassAssignment_5 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2329:1: ( ( rule__RenameMethod__SourceClassAssignment_5 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2330:1: ( rule__RenameMethod__SourceClassAssignment_5 )
            {
             before(grammarAccess.getRenameMethodAccess().getSourceClassAssignment_5()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2331:1: ( rule__RenameMethod__SourceClassAssignment_5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2331:2: rule__RenameMethod__SourceClassAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__SourceClassAssignment_5_in_rule__RenameMethod__Group__5__Impl4657);
            rule__RenameMethod__SourceClassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRenameMethodAccess().getSourceClassAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__5__Impl"


    // $ANTLR start "rule__RenameMethod__Group__6"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2341:1: rule__RenameMethod__Group__6 : rule__RenameMethod__Group__6__Impl rule__RenameMethod__Group__7 ;
    public final void rule__RenameMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2345:1: ( rule__RenameMethod__Group__6__Impl rule__RenameMethod__Group__7 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2346:2: rule__RenameMethod__Group__6__Impl rule__RenameMethod__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__6__Impl_in_rule__RenameMethod__Group__64687);
            rule__RenameMethod__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__7_in_rule__RenameMethod__Group__64690);
            rule__RenameMethod__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__6"


    // $ANTLR start "rule__RenameMethod__Group__6__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2353:1: rule__RenameMethod__Group__6__Impl : ( 'methodToBeRename' ) ;
    public final void rule__RenameMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2357:1: ( ( 'methodToBeRename' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2358:1: ( 'methodToBeRename' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2358:1: ( 'methodToBeRename' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2359:1: 'methodToBeRename'
            {
             before(grammarAccess.getRenameMethodAccess().getMethodToBeRenameKeyword_6()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__RenameMethod__Group__6__Impl4718); 
             after(grammarAccess.getRenameMethodAccess().getMethodToBeRenameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__6__Impl"


    // $ANTLR start "rule__RenameMethod__Group__7"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2372:1: rule__RenameMethod__Group__7 : rule__RenameMethod__Group__7__Impl rule__RenameMethod__Group__8 ;
    public final void rule__RenameMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2376:1: ( rule__RenameMethod__Group__7__Impl rule__RenameMethod__Group__8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2377:2: rule__RenameMethod__Group__7__Impl rule__RenameMethod__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__7__Impl_in_rule__RenameMethod__Group__74749);
            rule__RenameMethod__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__8_in_rule__RenameMethod__Group__74752);
            rule__RenameMethod__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__7"


    // $ANTLR start "rule__RenameMethod__Group__7__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2384:1: rule__RenameMethod__Group__7__Impl : ( ':' ) ;
    public final void rule__RenameMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2388:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2389:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2389:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2390:1: ':'
            {
             before(grammarAccess.getRenameMethodAccess().getColonKeyword_7()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameMethod__Group__7__Impl4780); 
             after(grammarAccess.getRenameMethodAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__7__Impl"


    // $ANTLR start "rule__RenameMethod__Group__8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2403:1: rule__RenameMethod__Group__8 : rule__RenameMethod__Group__8__Impl rule__RenameMethod__Group__9 ;
    public final void rule__RenameMethod__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: ( rule__RenameMethod__Group__8__Impl rule__RenameMethod__Group__9 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2408:2: rule__RenameMethod__Group__8__Impl rule__RenameMethod__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__8__Impl_in_rule__RenameMethod__Group__84811);
            rule__RenameMethod__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__9_in_rule__RenameMethod__Group__84814);
            rule__RenameMethod__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__8"


    // $ANTLR start "rule__RenameMethod__Group__8__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2415:1: rule__RenameMethod__Group__8__Impl : ( ( rule__RenameMethod__MethodToBeRenameAssignment_8 ) ) ;
    public final void rule__RenameMethod__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2419:1: ( ( ( rule__RenameMethod__MethodToBeRenameAssignment_8 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2420:1: ( ( rule__RenameMethod__MethodToBeRenameAssignment_8 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2420:1: ( ( rule__RenameMethod__MethodToBeRenameAssignment_8 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2421:1: ( rule__RenameMethod__MethodToBeRenameAssignment_8 )
            {
             before(grammarAccess.getRenameMethodAccess().getMethodToBeRenameAssignment_8()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2422:1: ( rule__RenameMethod__MethodToBeRenameAssignment_8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2422:2: rule__RenameMethod__MethodToBeRenameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__MethodToBeRenameAssignment_8_in_rule__RenameMethod__Group__8__Impl4841);
            rule__RenameMethod__MethodToBeRenameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRenameMethodAccess().getMethodToBeRenameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__8__Impl"


    // $ANTLR start "rule__RenameMethod__Group__9"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2432:1: rule__RenameMethod__Group__9 : rule__RenameMethod__Group__9__Impl rule__RenameMethod__Group__10 ;
    public final void rule__RenameMethod__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2436:1: ( rule__RenameMethod__Group__9__Impl rule__RenameMethod__Group__10 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2437:2: rule__RenameMethod__Group__9__Impl rule__RenameMethod__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__9__Impl_in_rule__RenameMethod__Group__94871);
            rule__RenameMethod__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__10_in_rule__RenameMethod__Group__94874);
            rule__RenameMethod__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__9"


    // $ANTLR start "rule__RenameMethod__Group__9__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2444:1: rule__RenameMethod__Group__9__Impl : ( 'newName' ) ;
    public final void rule__RenameMethod__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2448:1: ( ( 'newName' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2449:1: ( 'newName' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2449:1: ( 'newName' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2450:1: 'newName'
            {
             before(grammarAccess.getRenameMethodAccess().getNewNameKeyword_9()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RenameMethod__Group__9__Impl4902); 
             after(grammarAccess.getRenameMethodAccess().getNewNameKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__9__Impl"


    // $ANTLR start "rule__RenameMethod__Group__10"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2463:1: rule__RenameMethod__Group__10 : rule__RenameMethod__Group__10__Impl rule__RenameMethod__Group__11 ;
    public final void rule__RenameMethod__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2467:1: ( rule__RenameMethod__Group__10__Impl rule__RenameMethod__Group__11 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2468:2: rule__RenameMethod__Group__10__Impl rule__RenameMethod__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__10__Impl_in_rule__RenameMethod__Group__104933);
            rule__RenameMethod__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__11_in_rule__RenameMethod__Group__104936);
            rule__RenameMethod__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__10"


    // $ANTLR start "rule__RenameMethod__Group__10__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2475:1: rule__RenameMethod__Group__10__Impl : ( ':' ) ;
    public final void rule__RenameMethod__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2479:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2480:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2480:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2481:1: ':'
            {
             before(grammarAccess.getRenameMethodAccess().getColonKeyword_10()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RenameMethod__Group__10__Impl4964); 
             after(grammarAccess.getRenameMethodAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__10__Impl"


    // $ANTLR start "rule__RenameMethod__Group__11"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2494:1: rule__RenameMethod__Group__11 : rule__RenameMethod__Group__11__Impl rule__RenameMethod__Group__12 ;
    public final void rule__RenameMethod__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2498:1: ( rule__RenameMethod__Group__11__Impl rule__RenameMethod__Group__12 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2499:2: rule__RenameMethod__Group__11__Impl rule__RenameMethod__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__11__Impl_in_rule__RenameMethod__Group__114995);
            rule__RenameMethod__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__12_in_rule__RenameMethod__Group__114998);
            rule__RenameMethod__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__11"


    // $ANTLR start "rule__RenameMethod__Group__11__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2506:1: rule__RenameMethod__Group__11__Impl : ( ( rule__RenameMethod__NewNameAssignment_11 ) ) ;
    public final void rule__RenameMethod__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2510:1: ( ( ( rule__RenameMethod__NewNameAssignment_11 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2511:1: ( ( rule__RenameMethod__NewNameAssignment_11 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2511:1: ( ( rule__RenameMethod__NewNameAssignment_11 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2512:1: ( rule__RenameMethod__NewNameAssignment_11 )
            {
             before(grammarAccess.getRenameMethodAccess().getNewNameAssignment_11()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2513:1: ( rule__RenameMethod__NewNameAssignment_11 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2513:2: rule__RenameMethod__NewNameAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__NewNameAssignment_11_in_rule__RenameMethod__Group__11__Impl5025);
            rule__RenameMethod__NewNameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRenameMethodAccess().getNewNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__11__Impl"


    // $ANTLR start "rule__RenameMethod__Group__12"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2523:1: rule__RenameMethod__Group__12 : rule__RenameMethod__Group__12__Impl ;
    public final void rule__RenameMethod__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2527:1: ( rule__RenameMethod__Group__12__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2528:2: rule__RenameMethod__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameMethod__Group__12__Impl_in_rule__RenameMethod__Group__125055);
            rule__RenameMethod__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__12"


    // $ANTLR start "rule__RenameMethod__Group__12__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2534:1: rule__RenameMethod__Group__12__Impl : ( '}' ) ;
    public final void rule__RenameMethod__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2538:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2539:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2539:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2540:1: '}'
            {
             before(grammarAccess.getRenameMethodAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RenameMethod__Group__12__Impl5083); 
             after(grammarAccess.getRenameMethodAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__Group__12__Impl"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2579:1: rule__MovingFeaturesBetweenObjects__Group__0 : rule__MovingFeaturesBetweenObjects__Group__0__Impl rule__MovingFeaturesBetweenObjects__Group__1 ;
    public final void rule__MovingFeaturesBetweenObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2583:1: ( rule__MovingFeaturesBetweenObjects__Group__0__Impl rule__MovingFeaturesBetweenObjects__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2584:2: rule__MovingFeaturesBetweenObjects__Group__0__Impl rule__MovingFeaturesBetweenObjects__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__0__Impl_in_rule__MovingFeaturesBetweenObjects__Group__05140);
            rule__MovingFeaturesBetweenObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__1_in_rule__MovingFeaturesBetweenObjects__Group__05143);
            rule__MovingFeaturesBetweenObjects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__0"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2591:1: rule__MovingFeaturesBetweenObjects__Group__0__Impl : ( 'MovingFeaturesBetweenObjects' ) ;
    public final void rule__MovingFeaturesBetweenObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2595:1: ( ( 'MovingFeaturesBetweenObjects' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2596:1: ( 'MovingFeaturesBetweenObjects' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2596:1: ( 'MovingFeaturesBetweenObjects' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2597:1: 'MovingFeaturesBetweenObjects'
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getMovingFeaturesBetweenObjectsKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MovingFeaturesBetweenObjects__Group__0__Impl5171); 
             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getMovingFeaturesBetweenObjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__0__Impl"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2610:1: rule__MovingFeaturesBetweenObjects__Group__1 : rule__MovingFeaturesBetweenObjects__Group__1__Impl rule__MovingFeaturesBetweenObjects__Group__2 ;
    public final void rule__MovingFeaturesBetweenObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2614:1: ( rule__MovingFeaturesBetweenObjects__Group__1__Impl rule__MovingFeaturesBetweenObjects__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2615:2: rule__MovingFeaturesBetweenObjects__Group__1__Impl rule__MovingFeaturesBetweenObjects__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__1__Impl_in_rule__MovingFeaturesBetweenObjects__Group__15202);
            rule__MovingFeaturesBetweenObjects__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__2_in_rule__MovingFeaturesBetweenObjects__Group__15205);
            rule__MovingFeaturesBetweenObjects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__1"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2622:1: rule__MovingFeaturesBetweenObjects__Group__1__Impl : ( ( rule__MovingFeaturesBetweenObjects__NameAssignment_1 ) ) ;
    public final void rule__MovingFeaturesBetweenObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2626:1: ( ( ( rule__MovingFeaturesBetweenObjects__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2627:1: ( ( rule__MovingFeaturesBetweenObjects__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2627:1: ( ( rule__MovingFeaturesBetweenObjects__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2628:1: ( rule__MovingFeaturesBetweenObjects__NameAssignment_1 )
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2629:1: ( rule__MovingFeaturesBetweenObjects__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2629:2: rule__MovingFeaturesBetweenObjects__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__NameAssignment_1_in_rule__MovingFeaturesBetweenObjects__Group__1__Impl5232);
            rule__MovingFeaturesBetweenObjects__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__1__Impl"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2639:1: rule__MovingFeaturesBetweenObjects__Group__2 : rule__MovingFeaturesBetweenObjects__Group__2__Impl rule__MovingFeaturesBetweenObjects__Group__3 ;
    public final void rule__MovingFeaturesBetweenObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2643:1: ( rule__MovingFeaturesBetweenObjects__Group__2__Impl rule__MovingFeaturesBetweenObjects__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2644:2: rule__MovingFeaturesBetweenObjects__Group__2__Impl rule__MovingFeaturesBetweenObjects__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__2__Impl_in_rule__MovingFeaturesBetweenObjects__Group__25262);
            rule__MovingFeaturesBetweenObjects__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__3_in_rule__MovingFeaturesBetweenObjects__Group__25265);
            rule__MovingFeaturesBetweenObjects__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__2"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2651:1: rule__MovingFeaturesBetweenObjects__Group__2__Impl : ( '{' ) ;
    public final void rule__MovingFeaturesBetweenObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2655:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2656:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2656:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2657:1: '{'
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MovingFeaturesBetweenObjects__Group__2__Impl5293); 
             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__2__Impl"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2670:1: rule__MovingFeaturesBetweenObjects__Group__3 : rule__MovingFeaturesBetweenObjects__Group__3__Impl rule__MovingFeaturesBetweenObjects__Group__4 ;
    public final void rule__MovingFeaturesBetweenObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2674:1: ( rule__MovingFeaturesBetweenObjects__Group__3__Impl rule__MovingFeaturesBetweenObjects__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2675:2: rule__MovingFeaturesBetweenObjects__Group__3__Impl rule__MovingFeaturesBetweenObjects__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__3__Impl_in_rule__MovingFeaturesBetweenObjects__Group__35324);
            rule__MovingFeaturesBetweenObjects__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__4_in_rule__MovingFeaturesBetweenObjects__Group__35327);
            rule__MovingFeaturesBetweenObjects__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__3"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2682:1: rule__MovingFeaturesBetweenObjects__Group__3__Impl : ( ( rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 )* ) ;
    public final void rule__MovingFeaturesBetweenObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2686:1: ( ( ( rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2687:1: ( ( rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2687:1: ( ( rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2688:1: ( rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 )*
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getAllRefactoringsAssignment_3()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2689:1: ( rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2689:2: rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3_in_rule__MovingFeaturesBetweenObjects__Group__3__Impl5354);
            	    rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getAllRefactoringsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__3__Impl"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2699:1: rule__MovingFeaturesBetweenObjects__Group__4 : rule__MovingFeaturesBetweenObjects__Group__4__Impl ;
    public final void rule__MovingFeaturesBetweenObjects__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2703:1: ( rule__MovingFeaturesBetweenObjects__Group__4__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2704:2: rule__MovingFeaturesBetweenObjects__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MovingFeaturesBetweenObjects__Group__4__Impl_in_rule__MovingFeaturesBetweenObjects__Group__45385);
            rule__MovingFeaturesBetweenObjects__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__4"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2710:1: rule__MovingFeaturesBetweenObjects__Group__4__Impl : ( '}' ) ;
    public final void rule__MovingFeaturesBetweenObjects__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2714:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2715:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2715:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2716:1: '}'
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MovingFeaturesBetweenObjects__Group__4__Impl5413); 
             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__Group__4__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2739:1: rule__MoveAttribute__Group__0 : rule__MoveAttribute__Group__0__Impl rule__MoveAttribute__Group__1 ;
    public final void rule__MoveAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2743:1: ( rule__MoveAttribute__Group__0__Impl rule__MoveAttribute__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2744:2: rule__MoveAttribute__Group__0__Impl rule__MoveAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__0__Impl_in_rule__MoveAttribute__Group__05454);
            rule__MoveAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__1_in_rule__MoveAttribute__Group__05457);
            rule__MoveAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__0"


    // $ANTLR start "rule__MoveAttribute__Group__0__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2751:1: rule__MoveAttribute__Group__0__Impl : ( 'Refactoring_MoveAttribute' ) ;
    public final void rule__MoveAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2755:1: ( ( 'Refactoring_MoveAttribute' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2756:1: ( 'Refactoring_MoveAttribute' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2756:1: ( 'Refactoring_MoveAttribute' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2757:1: 'Refactoring_MoveAttribute'
            {
             before(grammarAccess.getMoveAttributeAccess().getRefactoring_MoveAttributeKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MoveAttribute__Group__0__Impl5485); 
             after(grammarAccess.getMoveAttributeAccess().getRefactoring_MoveAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__0__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2770:1: rule__MoveAttribute__Group__1 : rule__MoveAttribute__Group__1__Impl rule__MoveAttribute__Group__2 ;
    public final void rule__MoveAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2774:1: ( rule__MoveAttribute__Group__1__Impl rule__MoveAttribute__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2775:2: rule__MoveAttribute__Group__1__Impl rule__MoveAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__1__Impl_in_rule__MoveAttribute__Group__15516);
            rule__MoveAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__2_in_rule__MoveAttribute__Group__15519);
            rule__MoveAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__1"


    // $ANTLR start "rule__MoveAttribute__Group__1__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2782:1: rule__MoveAttribute__Group__1__Impl : ( ( rule__MoveAttribute__NameAssignment_1 ) ) ;
    public final void rule__MoveAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2786:1: ( ( ( rule__MoveAttribute__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2787:1: ( ( rule__MoveAttribute__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2787:1: ( ( rule__MoveAttribute__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2788:1: ( rule__MoveAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getMoveAttributeAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2789:1: ( rule__MoveAttribute__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2789:2: rule__MoveAttribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__NameAssignment_1_in_rule__MoveAttribute__Group__1__Impl5546);
            rule__MoveAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__1__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2799:1: rule__MoveAttribute__Group__2 : rule__MoveAttribute__Group__2__Impl rule__MoveAttribute__Group__3 ;
    public final void rule__MoveAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2803:1: ( rule__MoveAttribute__Group__2__Impl rule__MoveAttribute__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2804:2: rule__MoveAttribute__Group__2__Impl rule__MoveAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__2__Impl_in_rule__MoveAttribute__Group__25576);
            rule__MoveAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__3_in_rule__MoveAttribute__Group__25579);
            rule__MoveAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__2"


    // $ANTLR start "rule__MoveAttribute__Group__2__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2811:1: rule__MoveAttribute__Group__2__Impl : ( '{' ) ;
    public final void rule__MoveAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2815:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2816:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2816:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2817:1: '{'
            {
             before(grammarAccess.getMoveAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MoveAttribute__Group__2__Impl5607); 
             after(grammarAccess.getMoveAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__2__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2830:1: rule__MoveAttribute__Group__3 : rule__MoveAttribute__Group__3__Impl rule__MoveAttribute__Group__4 ;
    public final void rule__MoveAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2834:1: ( rule__MoveAttribute__Group__3__Impl rule__MoveAttribute__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2835:2: rule__MoveAttribute__Group__3__Impl rule__MoveAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__3__Impl_in_rule__MoveAttribute__Group__35638);
            rule__MoveAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__4_in_rule__MoveAttribute__Group__35641);
            rule__MoveAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__3"


    // $ANTLR start "rule__MoveAttribute__Group__3__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2842:1: rule__MoveAttribute__Group__3__Impl : ( 'sourceClass' ) ;
    public final void rule__MoveAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2846:1: ( ( 'sourceClass' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2847:1: ( 'sourceClass' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2847:1: ( 'sourceClass' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2848:1: 'sourceClass'
            {
             before(grammarAccess.getMoveAttributeAccess().getSourceClassKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MoveAttribute__Group__3__Impl5669); 
             after(grammarAccess.getMoveAttributeAccess().getSourceClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__3__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2861:1: rule__MoveAttribute__Group__4 : rule__MoveAttribute__Group__4__Impl rule__MoveAttribute__Group__5 ;
    public final void rule__MoveAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2865:1: ( rule__MoveAttribute__Group__4__Impl rule__MoveAttribute__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2866:2: rule__MoveAttribute__Group__4__Impl rule__MoveAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__4__Impl_in_rule__MoveAttribute__Group__45700);
            rule__MoveAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__5_in_rule__MoveAttribute__Group__45703);
            rule__MoveAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__4"


    // $ANTLR start "rule__MoveAttribute__Group__4__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2873:1: rule__MoveAttribute__Group__4__Impl : ( ':' ) ;
    public final void rule__MoveAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2877:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2878:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2878:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2879:1: ':'
            {
             before(grammarAccess.getMoveAttributeAccess().getColonKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MoveAttribute__Group__4__Impl5731); 
             after(grammarAccess.getMoveAttributeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__4__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2892:1: rule__MoveAttribute__Group__5 : rule__MoveAttribute__Group__5__Impl rule__MoveAttribute__Group__6 ;
    public final void rule__MoveAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2896:1: ( rule__MoveAttribute__Group__5__Impl rule__MoveAttribute__Group__6 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2897:2: rule__MoveAttribute__Group__5__Impl rule__MoveAttribute__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__5__Impl_in_rule__MoveAttribute__Group__55762);
            rule__MoveAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__6_in_rule__MoveAttribute__Group__55765);
            rule__MoveAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__5"


    // $ANTLR start "rule__MoveAttribute__Group__5__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2904:1: rule__MoveAttribute__Group__5__Impl : ( ( rule__MoveAttribute__SourceClassAssignment_5 ) ) ;
    public final void rule__MoveAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2908:1: ( ( ( rule__MoveAttribute__SourceClassAssignment_5 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2909:1: ( ( rule__MoveAttribute__SourceClassAssignment_5 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2909:1: ( ( rule__MoveAttribute__SourceClassAssignment_5 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2910:1: ( rule__MoveAttribute__SourceClassAssignment_5 )
            {
             before(grammarAccess.getMoveAttributeAccess().getSourceClassAssignment_5()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2911:1: ( rule__MoveAttribute__SourceClassAssignment_5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2911:2: rule__MoveAttribute__SourceClassAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__SourceClassAssignment_5_in_rule__MoveAttribute__Group__5__Impl5792);
            rule__MoveAttribute__SourceClassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMoveAttributeAccess().getSourceClassAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__5__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__6"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2921:1: rule__MoveAttribute__Group__6 : rule__MoveAttribute__Group__6__Impl rule__MoveAttribute__Group__7 ;
    public final void rule__MoveAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2925:1: ( rule__MoveAttribute__Group__6__Impl rule__MoveAttribute__Group__7 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2926:2: rule__MoveAttribute__Group__6__Impl rule__MoveAttribute__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__6__Impl_in_rule__MoveAttribute__Group__65822);
            rule__MoveAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__7_in_rule__MoveAttribute__Group__65825);
            rule__MoveAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__6"


    // $ANTLR start "rule__MoveAttribute__Group__6__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2933:1: rule__MoveAttribute__Group__6__Impl : ( 'targetClass' ) ;
    public final void rule__MoveAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2937:1: ( ( 'targetClass' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2938:1: ( 'targetClass' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2938:1: ( 'targetClass' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2939:1: 'targetClass'
            {
             before(grammarAccess.getMoveAttributeAccess().getTargetClassKeyword_6()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MoveAttribute__Group__6__Impl5853); 
             after(grammarAccess.getMoveAttributeAccess().getTargetClassKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__6__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__7"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2952:1: rule__MoveAttribute__Group__7 : rule__MoveAttribute__Group__7__Impl rule__MoveAttribute__Group__8 ;
    public final void rule__MoveAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2956:1: ( rule__MoveAttribute__Group__7__Impl rule__MoveAttribute__Group__8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2957:2: rule__MoveAttribute__Group__7__Impl rule__MoveAttribute__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__7__Impl_in_rule__MoveAttribute__Group__75884);
            rule__MoveAttribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__8_in_rule__MoveAttribute__Group__75887);
            rule__MoveAttribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__7"


    // $ANTLR start "rule__MoveAttribute__Group__7__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2964:1: rule__MoveAttribute__Group__7__Impl : ( ':' ) ;
    public final void rule__MoveAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2968:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2969:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2969:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2970:1: ':'
            {
             before(grammarAccess.getMoveAttributeAccess().getColonKeyword_7()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MoveAttribute__Group__7__Impl5915); 
             after(grammarAccess.getMoveAttributeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__7__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2983:1: rule__MoveAttribute__Group__8 : rule__MoveAttribute__Group__8__Impl rule__MoveAttribute__Group__9 ;
    public final void rule__MoveAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2987:1: ( rule__MoveAttribute__Group__8__Impl rule__MoveAttribute__Group__9 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2988:2: rule__MoveAttribute__Group__8__Impl rule__MoveAttribute__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__8__Impl_in_rule__MoveAttribute__Group__85946);
            rule__MoveAttribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__9_in_rule__MoveAttribute__Group__85949);
            rule__MoveAttribute__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__8"


    // $ANTLR start "rule__MoveAttribute__Group__8__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2995:1: rule__MoveAttribute__Group__8__Impl : ( ( rule__MoveAttribute__TargetClassAssignment_8 ) ) ;
    public final void rule__MoveAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2999:1: ( ( ( rule__MoveAttribute__TargetClassAssignment_8 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3000:1: ( ( rule__MoveAttribute__TargetClassAssignment_8 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3000:1: ( ( rule__MoveAttribute__TargetClassAssignment_8 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3001:1: ( rule__MoveAttribute__TargetClassAssignment_8 )
            {
             before(grammarAccess.getMoveAttributeAccess().getTargetClassAssignment_8()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3002:1: ( rule__MoveAttribute__TargetClassAssignment_8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3002:2: rule__MoveAttribute__TargetClassAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__TargetClassAssignment_8_in_rule__MoveAttribute__Group__8__Impl5976);
            rule__MoveAttribute__TargetClassAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMoveAttributeAccess().getTargetClassAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__8__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__9"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3012:1: rule__MoveAttribute__Group__9 : rule__MoveAttribute__Group__9__Impl rule__MoveAttribute__Group__10 ;
    public final void rule__MoveAttribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3016:1: ( rule__MoveAttribute__Group__9__Impl rule__MoveAttribute__Group__10 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3017:2: rule__MoveAttribute__Group__9__Impl rule__MoveAttribute__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__9__Impl_in_rule__MoveAttribute__Group__96006);
            rule__MoveAttribute__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__10_in_rule__MoveAttribute__Group__96009);
            rule__MoveAttribute__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__9"


    // $ANTLR start "rule__MoveAttribute__Group__9__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3024:1: rule__MoveAttribute__Group__9__Impl : ( 'attributeToBeMoved' ) ;
    public final void rule__MoveAttribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3028:1: ( ( 'attributeToBeMoved' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3029:1: ( 'attributeToBeMoved' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3029:1: ( 'attributeToBeMoved' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3030:1: 'attributeToBeMoved'
            {
             before(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedKeyword_9()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MoveAttribute__Group__9__Impl6037); 
             after(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__9__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__10"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3043:1: rule__MoveAttribute__Group__10 : rule__MoveAttribute__Group__10__Impl rule__MoveAttribute__Group__11 ;
    public final void rule__MoveAttribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3047:1: ( rule__MoveAttribute__Group__10__Impl rule__MoveAttribute__Group__11 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3048:2: rule__MoveAttribute__Group__10__Impl rule__MoveAttribute__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__10__Impl_in_rule__MoveAttribute__Group__106068);
            rule__MoveAttribute__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__11_in_rule__MoveAttribute__Group__106071);
            rule__MoveAttribute__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__10"


    // $ANTLR start "rule__MoveAttribute__Group__10__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3055:1: rule__MoveAttribute__Group__10__Impl : ( ':' ) ;
    public final void rule__MoveAttribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3059:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3060:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3060:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3061:1: ':'
            {
             before(grammarAccess.getMoveAttributeAccess().getColonKeyword_10()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MoveAttribute__Group__10__Impl6099); 
             after(grammarAccess.getMoveAttributeAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__10__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__11"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3074:1: rule__MoveAttribute__Group__11 : rule__MoveAttribute__Group__11__Impl rule__MoveAttribute__Group__12 ;
    public final void rule__MoveAttribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3078:1: ( rule__MoveAttribute__Group__11__Impl rule__MoveAttribute__Group__12 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3079:2: rule__MoveAttribute__Group__11__Impl rule__MoveAttribute__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__11__Impl_in_rule__MoveAttribute__Group__116130);
            rule__MoveAttribute__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__12_in_rule__MoveAttribute__Group__116133);
            rule__MoveAttribute__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__11"


    // $ANTLR start "rule__MoveAttribute__Group__11__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3086:1: rule__MoveAttribute__Group__11__Impl : ( ( rule__MoveAttribute__AttributeToBeMovedAssignment_11 ) ) ;
    public final void rule__MoveAttribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3090:1: ( ( ( rule__MoveAttribute__AttributeToBeMovedAssignment_11 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3091:1: ( ( rule__MoveAttribute__AttributeToBeMovedAssignment_11 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3091:1: ( ( rule__MoveAttribute__AttributeToBeMovedAssignment_11 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3092:1: ( rule__MoveAttribute__AttributeToBeMovedAssignment_11 )
            {
             before(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAssignment_11()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3093:1: ( rule__MoveAttribute__AttributeToBeMovedAssignment_11 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3093:2: rule__MoveAttribute__AttributeToBeMovedAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__AttributeToBeMovedAssignment_11_in_rule__MoveAttribute__Group__11__Impl6160);
            rule__MoveAttribute__AttributeToBeMovedAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__11__Impl"


    // $ANTLR start "rule__MoveAttribute__Group__12"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3103:1: rule__MoveAttribute__Group__12 : rule__MoveAttribute__Group__12__Impl ;
    public final void rule__MoveAttribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3107:1: ( rule__MoveAttribute__Group__12__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3108:2: rule__MoveAttribute__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveAttribute__Group__12__Impl_in_rule__MoveAttribute__Group__126190);
            rule__MoveAttribute__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__12"


    // $ANTLR start "rule__MoveAttribute__Group__12__Impl"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3114:1: rule__MoveAttribute__Group__12__Impl : ( '}' ) ;
    public final void rule__MoveAttribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3118:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3119:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3119:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3120:1: '}'
            {
             before(grammarAccess.getMoveAttributeAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MoveAttribute__Group__12__Impl6218); 
             after(grammarAccess.getMoveAttributeAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__Group__12__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3160:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3164:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3165:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3165:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3166:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Model__NameAssignment_16280); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3175:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3179:1: ( ( ruleImport ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3180:1: ( ruleImport )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3180:1: ( ruleImport )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3181:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_26311);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_2"


    // $ANTLR start "rule__Model__ContainsAssignment_3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3190:1: rule__Model__ContainsAssignment_3 : ( ruleType ) ;
    public final void rule__Model__ContainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3194:1: ( ( ruleType ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3195:1: ( ruleType )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3195:1: ( ruleType )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3196:1: ruleType
            {
             before(grammarAccess.getModelAccess().getContainsTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Model__ContainsAssignment_36342);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContainsTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContainsAssignment_3"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3205:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3209:1: ( ( RULE_STRING ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3210:1: ( RULE_STRING )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3210:1: ( RULE_STRING )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3211:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_16373); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3220:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3224:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3225:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3225:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3226:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Class__NameAssignment_16404); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__AttributesAssignment_3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3235:1: rule__Class__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3239:1: ( ( ruleAttribute ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3240:1: ( ruleAttribute )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3240:1: ( ruleAttribute )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3241:1: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_36435);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_3"


    // $ANTLR start "rule__Class__MethodsAssignment_4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3250:1: rule__Class__MethodsAssignment_4 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3254:1: ( ( ruleMethod ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3255:1: ( ruleMethod )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3255:1: ( ruleMethod )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3256:1: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__Class__MethodsAssignment_46466);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_4"


    // $ANTLR start "rule__Attribute__ElementTypeAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3265:1: rule__Attribute__ElementTypeAssignment_1 : ( ruleElementType ) ;
    public final void rule__Attribute__ElementTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3269:1: ( ( ruleElementType ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3270:1: ( ruleElementType )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3270:1: ( ruleElementType )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3271:1: ruleElementType
            {
             before(grammarAccess.getAttributeAccess().getElementTypeElementTypeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElementType_in_rule__Attribute__ElementTypeAssignment_16497);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getElementTypeElementTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ElementTypeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3280:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3284:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3285:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3285:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3286:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_26528); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3295:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3299:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3300:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3300:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3301:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3302:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3302:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment6559);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__ClassType__ClassTypeAssignment"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3311:1: rule__ClassType__ClassTypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__ClassTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3315:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3316:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3316:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3317:1: ( RULE_ID )
            {
             before(grammarAccess.getClassTypeAccess().getClassTypeClassCrossReference_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3318:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3319:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getClassTypeClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ClassType__ClassTypeAssignment6596); 
             after(grammarAccess.getClassTypeAccess().getClassTypeClassIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getClassTypeAccess().getClassTypeClassCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__ClassTypeAssignment"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3330:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3334:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3335:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3335:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3336:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Method__NameAssignment_16631); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__RenameFeature__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3345:1: rule__RenameFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3349:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3350:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3350:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3351:1: RULE_ID
            {
             before(grammarAccess.getRenameFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameFeature__NameAssignment_16662); 
             after(grammarAccess.getRenameFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__NameAssignment_1"


    // $ANTLR start "rule__RenameFeature__AllRefactoringsAssignment_3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3360:1: rule__RenameFeature__AllRefactoringsAssignment_3 : ( ruleRenameClass ) ;
    public final void rule__RenameFeature__AllRefactoringsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3364:1: ( ( ruleRenameClass ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3365:1: ( ruleRenameClass )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3365:1: ( ruleRenameClass )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3366:1: ruleRenameClass
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_rule__RenameFeature__AllRefactoringsAssignment_36693);
            ruleRenameClass();

            state._fsp--;

             after(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__AllRefactoringsAssignment_3"


    // $ANTLR start "rule__RenameFeature__AllRefactoringsAssignment_4"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3375:1: rule__RenameFeature__AllRefactoringsAssignment_4 : ( ruleRenameAttribute ) ;
    public final void rule__RenameFeature__AllRefactoringsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3379:1: ( ( ruleRenameAttribute ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3380:1: ( ruleRenameAttribute )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3380:1: ( ruleRenameAttribute )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3381:1: ruleRenameAttribute
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameAttributeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameAttribute_in_rule__RenameFeature__AllRefactoringsAssignment_46724);
            ruleRenameAttribute();

            state._fsp--;

             after(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__AllRefactoringsAssignment_4"


    // $ANTLR start "rule__RenameFeature__AllRefactoringsAssignment_5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3390:1: rule__RenameFeature__AllRefactoringsAssignment_5 : ( ruleRenameMethod ) ;
    public final void rule__RenameFeature__AllRefactoringsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3394:1: ( ( ruleRenameMethod ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3395:1: ( ruleRenameMethod )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3395:1: ( ruleRenameMethod )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3396:1: ruleRenameMethod
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameMethodParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameMethod_in_rule__RenameFeature__AllRefactoringsAssignment_56755);
            ruleRenameMethod();

            state._fsp--;

             after(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameFeature__AllRefactoringsAssignment_5"


    // $ANTLR start "rule__RenameClass__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3405:1: rule__RenameClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3409:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3410:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3410:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3411:1: RULE_ID
            {
             before(grammarAccess.getRenameClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameClass__NameAssignment_16786); 
             after(grammarAccess.getRenameClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__NameAssignment_1"


    // $ANTLR start "rule__RenameClass__ClassToBeRenameAssignment_5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3420:1: rule__RenameClass__ClassToBeRenameAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RenameClass__ClassToBeRenameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3424:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3425:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3425:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3426:1: ( RULE_ID )
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3427:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3428:1: RULE_ID
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameClass__ClassToBeRenameAssignment_56821); 
             after(grammarAccess.getRenameClassAccess().getClassToBeRenameClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__ClassToBeRenameAssignment_5"


    // $ANTLR start "rule__RenameClass__NewNameAssignment_8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3439:1: rule__RenameClass__NewNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__RenameClass__NewNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3443:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3444:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3444:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: RULE_ID
            {
             before(grammarAccess.getRenameClassAccess().getNewNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameClass__NewNameAssignment_86856); 
             after(grammarAccess.getRenameClassAccess().getNewNameIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameClass__NewNameAssignment_8"


    // $ANTLR start "rule__RenameAttribute__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3454:1: rule__RenameAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3458:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3459:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3459:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3460:1: RULE_ID
            {
             before(grammarAccess.getRenameAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameAttribute__NameAssignment_16887); 
             after(grammarAccess.getRenameAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__NameAssignment_1"


    // $ANTLR start "rule__RenameAttribute__SourceClassAssignment_5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3469:1: rule__RenameAttribute__SourceClassAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RenameAttribute__SourceClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3473:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3474:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3474:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3475:1: ( RULE_ID )
            {
             before(grammarAccess.getRenameAttributeAccess().getSourceClassClassCrossReference_5_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3476:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3477:1: RULE_ID
            {
             before(grammarAccess.getRenameAttributeAccess().getSourceClassClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameAttribute__SourceClassAssignment_56922); 
             after(grammarAccess.getRenameAttributeAccess().getSourceClassClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRenameAttributeAccess().getSourceClassClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__SourceClassAssignment_5"


    // $ANTLR start "rule__RenameAttribute__AttributeToBeRenameAssignment_8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3488:1: rule__RenameAttribute__AttributeToBeRenameAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__RenameAttribute__AttributeToBeRenameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3492:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3493:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3493:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3494:1: ( RULE_ID )
            {
             before(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAttributeCrossReference_8_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3495:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3496:1: RULE_ID
            {
             before(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAttributeIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameAttribute__AttributeToBeRenameAssignment_86961); 
             after(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAttributeIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAttributeCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__AttributeToBeRenameAssignment_8"


    // $ANTLR start "rule__RenameAttribute__NewNameAssignment_11"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3507:1: rule__RenameAttribute__NewNameAssignment_11 : ( RULE_ID ) ;
    public final void rule__RenameAttribute__NewNameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3511:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3512:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3512:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3513:1: RULE_ID
            {
             before(grammarAccess.getRenameAttributeAccess().getNewNameIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameAttribute__NewNameAssignment_116996); 
             after(grammarAccess.getRenameAttributeAccess().getNewNameIDTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAttribute__NewNameAssignment_11"


    // $ANTLR start "rule__RenameMethod__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3522:1: rule__RenameMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3526:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3527:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3527:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3528:1: RULE_ID
            {
             before(grammarAccess.getRenameMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameMethod__NameAssignment_17027); 
             after(grammarAccess.getRenameMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__NameAssignment_1"


    // $ANTLR start "rule__RenameMethod__SourceClassAssignment_5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3537:1: rule__RenameMethod__SourceClassAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RenameMethod__SourceClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3541:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3542:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3542:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3543:1: ( RULE_ID )
            {
             before(grammarAccess.getRenameMethodAccess().getSourceClassClassCrossReference_5_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3544:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3545:1: RULE_ID
            {
             before(grammarAccess.getRenameMethodAccess().getSourceClassClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameMethod__SourceClassAssignment_57062); 
             after(grammarAccess.getRenameMethodAccess().getSourceClassClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRenameMethodAccess().getSourceClassClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__SourceClassAssignment_5"


    // $ANTLR start "rule__RenameMethod__MethodToBeRenameAssignment_8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3556:1: rule__RenameMethod__MethodToBeRenameAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__RenameMethod__MethodToBeRenameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3560:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3561:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3561:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3562:1: ( RULE_ID )
            {
             before(grammarAccess.getRenameMethodAccess().getMethodToBeRenameMethodCrossReference_8_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3563:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3564:1: RULE_ID
            {
             before(grammarAccess.getRenameMethodAccess().getMethodToBeRenameMethodIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameMethod__MethodToBeRenameAssignment_87101); 
             after(grammarAccess.getRenameMethodAccess().getMethodToBeRenameMethodIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRenameMethodAccess().getMethodToBeRenameMethodCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__MethodToBeRenameAssignment_8"


    // $ANTLR start "rule__RenameMethod__NewNameAssignment_11"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3575:1: rule__RenameMethod__NewNameAssignment_11 : ( RULE_ID ) ;
    public final void rule__RenameMethod__NewNameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3579:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3580:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3580:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3581:1: RULE_ID
            {
             before(grammarAccess.getRenameMethodAccess().getNewNameIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameMethod__NewNameAssignment_117136); 
             after(grammarAccess.getRenameMethodAccess().getNewNameIDTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameMethod__NewNameAssignment_11"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3590:1: rule__MovingFeaturesBetweenObjects__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MovingFeaturesBetweenObjects__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3594:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3595:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3595:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3596:1: RULE_ID
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MovingFeaturesBetweenObjects__NameAssignment_17167); 
             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__NameAssignment_1"


    // $ANTLR start "rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3605:1: rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3 : ( ruleMoveAttribute ) ;
    public final void rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3609:1: ( ( ruleMoveAttribute ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3610:1: ( ruleMoveAttribute )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3610:1: ( ruleMoveAttribute )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3611:1: ruleMoveAttribute
            {
             before(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getAllRefactoringsMoveAttributeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveAttribute_in_rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_37198);
            ruleMoveAttribute();

            state._fsp--;

             after(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getAllRefactoringsMoveAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3"


    // $ANTLR start "rule__MoveAttribute__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3620:1: rule__MoveAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MoveAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3624:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3625:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3625:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3626:1: RULE_ID
            {
             before(grammarAccess.getMoveAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveAttribute__NameAssignment_17229); 
             after(grammarAccess.getMoveAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__NameAssignment_1"


    // $ANTLR start "rule__MoveAttribute__SourceClassAssignment_5"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3635:1: rule__MoveAttribute__SourceClassAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MoveAttribute__SourceClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3639:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3640:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3640:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3641:1: ( RULE_ID )
            {
             before(grammarAccess.getMoveAttributeAccess().getSourceClassClassCrossReference_5_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3642:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3643:1: RULE_ID
            {
             before(grammarAccess.getMoveAttributeAccess().getSourceClassClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveAttribute__SourceClassAssignment_57264); 
             after(grammarAccess.getMoveAttributeAccess().getSourceClassClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMoveAttributeAccess().getSourceClassClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__SourceClassAssignment_5"


    // $ANTLR start "rule__MoveAttribute__TargetClassAssignment_8"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3654:1: rule__MoveAttribute__TargetClassAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__MoveAttribute__TargetClassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3658:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3659:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3659:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3660:1: ( RULE_ID )
            {
             before(grammarAccess.getMoveAttributeAccess().getTargetClassClassCrossReference_8_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3661:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3662:1: RULE_ID
            {
             before(grammarAccess.getMoveAttributeAccess().getTargetClassClassIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveAttribute__TargetClassAssignment_87303); 
             after(grammarAccess.getMoveAttributeAccess().getTargetClassClassIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getMoveAttributeAccess().getTargetClassClassCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__TargetClassAssignment_8"


    // $ANTLR start "rule__MoveAttribute__AttributeToBeMovedAssignment_11"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3673:1: rule__MoveAttribute__AttributeToBeMovedAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__MoveAttribute__AttributeToBeMovedAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3677:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3678:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3678:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3679:1: ( RULE_ID )
            {
             before(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAttributeCrossReference_11_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3680:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3681:1: RULE_ID
            {
             before(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAttributeIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveAttribute__AttributeToBeMovedAssignment_117342); 
             after(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAttributeIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAttributeCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAttribute__AttributeToBeMovedAssignment_11"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_entryRuleClass241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementType368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementType__Alternatives_in_ruleElementType394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBasicType428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassType488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClassType__ClassTypeAssignment_in_ruleClassType514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_entryRuleRefactoring601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRefactoring608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Refactoring__Alternatives_in_ruleRefactoring634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameFeature668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__0_in_ruleRenameFeature694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_entryRuleRenameClass721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameClass728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__0_in_ruleRenameClass754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameAttribute_in_entryRuleRenameAttribute781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameAttribute788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__0_in_ruleRenameAttribute814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameMethod_in_entryRuleRenameMethod841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameMethod848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__0_in_ruleRenameMethod874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMovingFeaturesBetweenObjects_in_entryRuleMovingFeaturesBetweenObjects901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMovingFeaturesBetweenObjects908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__0_in_ruleMovingFeaturesBetweenObjects934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveAttribute_in_entryRuleMoveAttribute961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoveAttribute968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__0_in_ruleMoveAttribute994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_rule__Type__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_rule__Type__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassType_in_rule__ElementType__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_01129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_01149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BasicType__TypeNameAlternatives_01229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BasicType__TypeNameAlternatives_01249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BasicType__TypeNameAlternatives_01269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BasicType__TypeNameAlternatives_01289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_rule__Refactoring__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMovingFeaturesBetweenObjects_in_rule__Refactoring__Alternatives1340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01370 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Model__Group__0__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11432 = new BitSet(new long[]{0x0000002008600000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21492 = new BitSet(new long[]{0x0000002008600000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl1522 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ContainsAssignment_3_in_rule__Model__Group__3__Impl1580 = new BitSet(new long[]{0x0000002008400002L});
        public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01619 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Import__Group__0__Impl1650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class__Group__0__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11804 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21864 = new BitSet(new long[]{0x0000000007000000L});
        public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Class__Group__2__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31926 = new BitSet(new long[]{0x0000000007000000L});
        public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__AttributesAssignment_3_in_rule__Class__Group__3__Impl1956 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41987 = new BitSet(new long[]{0x0000000007000000L});
        public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__MethodsAssignment_4_in_rule__Class__Group__4__Impl2017 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Class__Group__5__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02119 = new BitSet(new long[]{0x00000000000FF810L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Attribute__Group__0__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12181 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__ElementTypeAssignment_1_in_rule__Attribute__Group__1__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02304 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Method__Group__0__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__0__Impl_in_rule__RenameFeature__Group__02427 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__1_in_rule__RenameFeature__Group__02430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RenameFeature__Group__0__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__1__Impl_in_rule__RenameFeature__Group__12489 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__2_in_rule__RenameFeature__Group__12492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__NameAssignment_1_in_rule__RenameFeature__Group__1__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__2__Impl_in_rule__RenameFeature__Group__22549 = new BitSet(new long[]{0x0000000911000000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__3_in_rule__RenameFeature__Group__22552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RenameFeature__Group__2__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__3__Impl_in_rule__RenameFeature__Group__32611 = new BitSet(new long[]{0x0000000911000000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__4_in_rule__RenameFeature__Group__32614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_3_in_rule__RenameFeature__Group__3__Impl2641 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__4__Impl_in_rule__RenameFeature__Group__42672 = new BitSet(new long[]{0x0000000911000000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__5_in_rule__RenameFeature__Group__42675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_4_in_rule__RenameFeature__Group__4__Impl2702 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__5__Impl_in_rule__RenameFeature__Group__52733 = new BitSet(new long[]{0x0000000911000000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__6_in_rule__RenameFeature__Group__52736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_5_in_rule__RenameFeature__Group__5__Impl2763 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__6__Impl_in_rule__RenameFeature__Group__62794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RenameFeature__Group__6__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__0__Impl_in_rule__RenameClass__Group__02867 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__1_in_rule__RenameClass__Group__02870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__RenameClass__Group__0__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__1__Impl_in_rule__RenameClass__Group__12929 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__2_in_rule__RenameClass__Group__12932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__NameAssignment_1_in_rule__RenameClass__Group__1__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__2__Impl_in_rule__RenameClass__Group__22989 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__3_in_rule__RenameClass__Group__22992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RenameClass__Group__2__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__3__Impl_in_rule__RenameClass__Group__33051 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__4_in_rule__RenameClass__Group__33054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RenameClass__Group__3__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__4__Impl_in_rule__RenameClass__Group__43113 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__5_in_rule__RenameClass__Group__43116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameClass__Group__4__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__5__Impl_in_rule__RenameClass__Group__53175 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__6_in_rule__RenameClass__Group__53178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__ClassToBeRenameAssignment_5_in_rule__RenameClass__Group__5__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__6__Impl_in_rule__RenameClass__Group__63235 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__7_in_rule__RenameClass__Group__63238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RenameClass__Group__6__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__7__Impl_in_rule__RenameClass__Group__73297 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__8_in_rule__RenameClass__Group__73300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameClass__Group__7__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__8__Impl_in_rule__RenameClass__Group__83359 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__9_in_rule__RenameClass__Group__83362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__NewNameAssignment_8_in_rule__RenameClass__Group__8__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__9__Impl_in_rule__RenameClass__Group__93419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RenameClass__Group__9__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__0__Impl_in_rule__RenameAttribute__Group__03498 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__1_in_rule__RenameAttribute__Group__03501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RenameAttribute__Group__0__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__1__Impl_in_rule__RenameAttribute__Group__13560 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__2_in_rule__RenameAttribute__Group__13563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__NameAssignment_1_in_rule__RenameAttribute__Group__1__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__2__Impl_in_rule__RenameAttribute__Group__23620 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__3_in_rule__RenameAttribute__Group__23623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RenameAttribute__Group__2__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__3__Impl_in_rule__RenameAttribute__Group__33682 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__4_in_rule__RenameAttribute__Group__33685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RenameAttribute__Group__3__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__4__Impl_in_rule__RenameAttribute__Group__43744 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__5_in_rule__RenameAttribute__Group__43747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameAttribute__Group__4__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__5__Impl_in_rule__RenameAttribute__Group__53806 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__6_in_rule__RenameAttribute__Group__53809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__SourceClassAssignment_5_in_rule__RenameAttribute__Group__5__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__6__Impl_in_rule__RenameAttribute__Group__63866 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__7_in_rule__RenameAttribute__Group__63869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__RenameAttribute__Group__6__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__7__Impl_in_rule__RenameAttribute__Group__73928 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__8_in_rule__RenameAttribute__Group__73931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameAttribute__Group__7__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__8__Impl_in_rule__RenameAttribute__Group__83990 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__9_in_rule__RenameAttribute__Group__83993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__AttributeToBeRenameAssignment_8_in_rule__RenameAttribute__Group__8__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__9__Impl_in_rule__RenameAttribute__Group__94050 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__10_in_rule__RenameAttribute__Group__94053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RenameAttribute__Group__9__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__10__Impl_in_rule__RenameAttribute__Group__104112 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__11_in_rule__RenameAttribute__Group__104115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameAttribute__Group__10__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__11__Impl_in_rule__RenameAttribute__Group__114174 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__12_in_rule__RenameAttribute__Group__114177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__NewNameAssignment_11_in_rule__RenameAttribute__Group__11__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameAttribute__Group__12__Impl_in_rule__RenameAttribute__Group__124234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RenameAttribute__Group__12__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__0__Impl_in_rule__RenameMethod__Group__04319 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__1_in_rule__RenameMethod__Group__04322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__RenameMethod__Group__0__Impl4350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__1__Impl_in_rule__RenameMethod__Group__14381 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__2_in_rule__RenameMethod__Group__14384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__NameAssignment_1_in_rule__RenameMethod__Group__1__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__2__Impl_in_rule__RenameMethod__Group__24441 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__3_in_rule__RenameMethod__Group__24444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RenameMethod__Group__2__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__3__Impl_in_rule__RenameMethod__Group__34503 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__4_in_rule__RenameMethod__Group__34506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RenameMethod__Group__3__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__4__Impl_in_rule__RenameMethod__Group__44565 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__5_in_rule__RenameMethod__Group__44568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameMethod__Group__4__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__5__Impl_in_rule__RenameMethod__Group__54627 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__6_in_rule__RenameMethod__Group__54630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__SourceClassAssignment_5_in_rule__RenameMethod__Group__5__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__6__Impl_in_rule__RenameMethod__Group__64687 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__7_in_rule__RenameMethod__Group__64690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__RenameMethod__Group__6__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__7__Impl_in_rule__RenameMethod__Group__74749 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__8_in_rule__RenameMethod__Group__74752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameMethod__Group__7__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__8__Impl_in_rule__RenameMethod__Group__84811 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__9_in_rule__RenameMethod__Group__84814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__MethodToBeRenameAssignment_8_in_rule__RenameMethod__Group__8__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__9__Impl_in_rule__RenameMethod__Group__94871 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__10_in_rule__RenameMethod__Group__94874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RenameMethod__Group__9__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__10__Impl_in_rule__RenameMethod__Group__104933 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__11_in_rule__RenameMethod__Group__104936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RenameMethod__Group__10__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__11__Impl_in_rule__RenameMethod__Group__114995 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__12_in_rule__RenameMethod__Group__114998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__NewNameAssignment_11_in_rule__RenameMethod__Group__11__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameMethod__Group__12__Impl_in_rule__RenameMethod__Group__125055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RenameMethod__Group__12__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__0__Impl_in_rule__MovingFeaturesBetweenObjects__Group__05140 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__1_in_rule__MovingFeaturesBetweenObjects__Group__05143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MovingFeaturesBetweenObjects__Group__0__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__1__Impl_in_rule__MovingFeaturesBetweenObjects__Group__15202 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__2_in_rule__MovingFeaturesBetweenObjects__Group__15205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__NameAssignment_1_in_rule__MovingFeaturesBetweenObjects__Group__1__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__2__Impl_in_rule__MovingFeaturesBetweenObjects__Group__25262 = new BitSet(new long[]{0x0000004001000000L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__3_in_rule__MovingFeaturesBetweenObjects__Group__25265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MovingFeaturesBetweenObjects__Group__2__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__3__Impl_in_rule__MovingFeaturesBetweenObjects__Group__35324 = new BitSet(new long[]{0x0000004001000000L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__4_in_rule__MovingFeaturesBetweenObjects__Group__35327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_3_in_rule__MovingFeaturesBetweenObjects__Group__3__Impl5354 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__MovingFeaturesBetweenObjects__Group__4__Impl_in_rule__MovingFeaturesBetweenObjects__Group__45385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MovingFeaturesBetweenObjects__Group__4__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__0__Impl_in_rule__MoveAttribute__Group__05454 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__1_in_rule__MoveAttribute__Group__05457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MoveAttribute__Group__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__1__Impl_in_rule__MoveAttribute__Group__15516 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__2_in_rule__MoveAttribute__Group__15519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__NameAssignment_1_in_rule__MoveAttribute__Group__1__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__2__Impl_in_rule__MoveAttribute__Group__25576 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__3_in_rule__MoveAttribute__Group__25579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MoveAttribute__Group__2__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__3__Impl_in_rule__MoveAttribute__Group__35638 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__4_in_rule__MoveAttribute__Group__35641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MoveAttribute__Group__3__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__4__Impl_in_rule__MoveAttribute__Group__45700 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__5_in_rule__MoveAttribute__Group__45703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MoveAttribute__Group__4__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__5__Impl_in_rule__MoveAttribute__Group__55762 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__6_in_rule__MoveAttribute__Group__55765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__SourceClassAssignment_5_in_rule__MoveAttribute__Group__5__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__6__Impl_in_rule__MoveAttribute__Group__65822 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__7_in_rule__MoveAttribute__Group__65825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MoveAttribute__Group__6__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__7__Impl_in_rule__MoveAttribute__Group__75884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__8_in_rule__MoveAttribute__Group__75887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MoveAttribute__Group__7__Impl5915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__8__Impl_in_rule__MoveAttribute__Group__85946 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__9_in_rule__MoveAttribute__Group__85949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__TargetClassAssignment_8_in_rule__MoveAttribute__Group__8__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__9__Impl_in_rule__MoveAttribute__Group__96006 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__10_in_rule__MoveAttribute__Group__96009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MoveAttribute__Group__9__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__10__Impl_in_rule__MoveAttribute__Group__106068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__11_in_rule__MoveAttribute__Group__106071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MoveAttribute__Group__10__Impl6099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__11__Impl_in_rule__MoveAttribute__Group__116130 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__12_in_rule__MoveAttribute__Group__116133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__AttributeToBeMovedAssignment_11_in_rule__MoveAttribute__Group__11__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveAttribute__Group__12__Impl_in_rule__MoveAttribute__Group__126190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MoveAttribute__Group__12__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_16280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_26311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Model__ContainsAssignment_36342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_16373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_16404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_36435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__Class__MethodsAssignment_46466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementType_in_rule__Attribute__ElementTypeAssignment_16497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_26528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment6559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__ClassTypeAssignment6596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_16631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameFeature__NameAssignment_16662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_rule__RenameFeature__AllRefactoringsAssignment_36693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameAttribute_in_rule__RenameFeature__AllRefactoringsAssignment_46724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameMethod_in_rule__RenameFeature__AllRefactoringsAssignment_56755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameClass__NameAssignment_16786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameClass__ClassToBeRenameAssignment_56821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameClass__NewNameAssignment_86856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameAttribute__NameAssignment_16887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameAttribute__SourceClassAssignment_56922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameAttribute__AttributeToBeRenameAssignment_86961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameAttribute__NewNameAssignment_116996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameMethod__NameAssignment_17027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameMethod__SourceClassAssignment_57062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameMethod__MethodToBeRenameAssignment_87101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameMethod__NewNameAssignment_117136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MovingFeaturesBetweenObjects__NameAssignment_17167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveAttribute_in_rule__MovingFeaturesBetweenObjects__AllRefactoringsAssignment_37198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveAttribute__NameAssignment_17229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveAttribute__SourceClassAssignment_57264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveAttribute__TargetClassAssignment_87303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveAttribute__AttributeToBeMovedAssignment_117342 = new BitSet(new long[]{0x0000000000000002L});
    }


}