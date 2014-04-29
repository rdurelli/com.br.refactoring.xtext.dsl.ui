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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'importing'", "'Class'", "'Rename_Feature'", "'{'", "'}'", "'Refactoring_RenameClass'", "'classToBeRename'", "':'", "'newName'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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


    // $ANTLR start "entryRuleRefactoring"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:172:1: entryRuleRefactoring : ruleRefactoring EOF ;
    public final void entryRuleRefactoring() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:173:1: ( ruleRefactoring EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:174:1: ruleRefactoring EOF
            {
             before(grammarAccess.getRefactoringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_entryRuleRefactoring301);
            ruleRefactoring();

            state._fsp--;

             after(grammarAccess.getRefactoringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRefactoring308); 

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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:181:1: ruleRefactoring : ( ruleRenameFeature ) ;
    public final void ruleRefactoring() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:185:2: ( ( ruleRenameFeature ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ruleRenameFeature )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ruleRenameFeature )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ruleRenameFeature
            {
             before(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_ruleRefactoring334);
            ruleRenameFeature();

            state._fsp--;

             after(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall()); 

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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:200:1: entryRuleRenameFeature : ruleRenameFeature EOF ;
    public final void entryRuleRenameFeature() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:201:1: ( ruleRenameFeature EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:202:1: ruleRenameFeature EOF
            {
             before(grammarAccess.getRenameFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature360);
            ruleRenameFeature();

            state._fsp--;

             after(grammarAccess.getRenameFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameFeature367); 

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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:209:1: ruleRenameFeature : ( ( rule__RenameFeature__Group__0 ) ) ;
    public final void ruleRenameFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:213:2: ( ( ( rule__RenameFeature__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__RenameFeature__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__RenameFeature__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:215:1: ( rule__RenameFeature__Group__0 )
            {
             before(grammarAccess.getRenameFeatureAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( rule__RenameFeature__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:216:2: rule__RenameFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__0_in_ruleRenameFeature393);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:228:1: entryRuleRenameClass : ruleRenameClass EOF ;
    public final void entryRuleRenameClass() throws RecognitionException {
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:229:1: ( ruleRenameClass EOF )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:230:1: ruleRenameClass EOF
            {
             before(grammarAccess.getRenameClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_entryRuleRenameClass420);
            ruleRenameClass();

            state._fsp--;

             after(grammarAccess.getRenameClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameClass427); 

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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:237:1: ruleRenameClass : ( ( rule__RenameClass__Group__0 ) ) ;
    public final void ruleRenameClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:241:2: ( ( ( rule__RenameClass__Group__0 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__RenameClass__Group__0 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__RenameClass__Group__0 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:243:1: ( rule__RenameClass__Group__0 )
            {
             before(grammarAccess.getRenameClassAccess().getGroup()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ( rule__RenameClass__Group__0 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:244:2: rule__RenameClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__0_in_ruleRenameClass453);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:256:1: rule__Type__Alternatives : ( ( ruleClass ) | ( ruleRefactoring ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:260:1: ( ( ruleClass ) | ( ruleRefactoring ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:261:1: ( ruleClass )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:261:1: ( ruleClass )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:262:1: ruleClass
                    {
                     before(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_rule__Type__Alternatives489);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:267:6: ( ruleRefactoring )
                    {
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:267:6: ( ruleRefactoring )
                    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:268:1: ruleRefactoring
                    {
                     before(grammarAccess.getTypeAccess().getRefactoringParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_rule__Type__Alternatives506);
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


    // $ANTLR start "rule__Model__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:280:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:284:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:285:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0536);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0539);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:292:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:296:1: ( ( 'model' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:297:1: ( 'model' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:297:1: ( 'model' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:298:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Model__Group__0__Impl567); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:311:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:315:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:316:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1598);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1601);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:323:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:327:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:329:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:330:1: ( rule__Model__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:330:2: rule__Model__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl628);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:340:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:344:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:345:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2658);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2661);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:352:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:357:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:357:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:358:1: ( rule__Model__ImportsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:359:1: ( rule__Model__ImportsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:359:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl688);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:369:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:373:1: ( rule__Model__Group__3__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:374:2: rule__Model__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3719);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:380:1: rule__Model__Group__3__Impl : ( ( rule__Model__ContainsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ( ( ( rule__Model__ContainsAssignment_3 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:385:1: ( ( rule__Model__ContainsAssignment_3 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:385:1: ( ( rule__Model__ContainsAssignment_3 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ( rule__Model__ContainsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getContainsAssignment_3()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:387:1: ( rule__Model__ContainsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:387:2: rule__Model__ContainsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__ContainsAssignment_3_in_rule__Model__Group__3__Impl746);
            	    rule__Model__ContainsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:405:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:409:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:410:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0785);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0788);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:417:1: rule__Import__Group__0__Impl : ( 'importing' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:421:1: ( ( 'importing' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:422:1: ( 'importing' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:422:1: ( 'importing' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:423:1: 'importing'
            {
             before(grammarAccess.getImportAccess().getImportingKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Import__Group__0__Impl816); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:436:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:440:1: ( rule__Import__Group__1__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:441:2: rule__Import__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1847);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:447:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:451:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:452:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:452:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:453:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:454:1: ( rule__Import__ImportURIAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:454:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl874);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:468:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:472:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:473:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__0908);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__1_in_rule__Class__Group__0911);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:480:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:484:1: ( ( 'Class' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:485:1: ( 'Class' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:485:1: ( 'Class' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:486:1: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Class__Group__0__Impl939); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:499:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:503:1: ( rule__Class__Group__1__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:504:2: rule__Class__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__1970);
            rule__Class__Group__1__Impl();

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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:510:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:514:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:515:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:515:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:516:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:517:1: ( rule__Class__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:517:2: rule__Class__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl997);
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


    // $ANTLR start "rule__RenameFeature__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:531:1: rule__RenameFeature__Group__0 : rule__RenameFeature__Group__0__Impl rule__RenameFeature__Group__1 ;
    public final void rule__RenameFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:535:1: ( rule__RenameFeature__Group__0__Impl rule__RenameFeature__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:536:2: rule__RenameFeature__Group__0__Impl rule__RenameFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__0__Impl_in_rule__RenameFeature__Group__01031);
            rule__RenameFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__1_in_rule__RenameFeature__Group__01034);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:543:1: rule__RenameFeature__Group__0__Impl : ( 'Rename_Feature' ) ;
    public final void rule__RenameFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:547:1: ( ( 'Rename_Feature' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:548:1: ( 'Rename_Feature' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:548:1: ( 'Rename_Feature' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:549:1: 'Rename_Feature'
            {
             before(grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RenameFeature__Group__0__Impl1062); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:562:1: rule__RenameFeature__Group__1 : rule__RenameFeature__Group__1__Impl rule__RenameFeature__Group__2 ;
    public final void rule__RenameFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:566:1: ( rule__RenameFeature__Group__1__Impl rule__RenameFeature__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:567:2: rule__RenameFeature__Group__1__Impl rule__RenameFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__1__Impl_in_rule__RenameFeature__Group__11093);
            rule__RenameFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__2_in_rule__RenameFeature__Group__11096);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:574:1: rule__RenameFeature__Group__1__Impl : ( ( rule__RenameFeature__NameAssignment_1 ) ) ;
    public final void rule__RenameFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:578:1: ( ( ( rule__RenameFeature__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:579:1: ( ( rule__RenameFeature__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:579:1: ( ( rule__RenameFeature__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:580:1: ( rule__RenameFeature__NameAssignment_1 )
            {
             before(grammarAccess.getRenameFeatureAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:581:1: ( rule__RenameFeature__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:581:2: rule__RenameFeature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__NameAssignment_1_in_rule__RenameFeature__Group__1__Impl1123);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:591:1: rule__RenameFeature__Group__2 : rule__RenameFeature__Group__2__Impl rule__RenameFeature__Group__3 ;
    public final void rule__RenameFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:595:1: ( rule__RenameFeature__Group__2__Impl rule__RenameFeature__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:596:2: rule__RenameFeature__Group__2__Impl rule__RenameFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__2__Impl_in_rule__RenameFeature__Group__21153);
            rule__RenameFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__3_in_rule__RenameFeature__Group__21156);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:603:1: rule__RenameFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__RenameFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:607:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:609:1: '{'
            {
             before(grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RenameFeature__Group__2__Impl1184); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:622:1: rule__RenameFeature__Group__3 : rule__RenameFeature__Group__3__Impl rule__RenameFeature__Group__4 ;
    public final void rule__RenameFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:626:1: ( rule__RenameFeature__Group__3__Impl rule__RenameFeature__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:627:2: rule__RenameFeature__Group__3__Impl rule__RenameFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__3__Impl_in_rule__RenameFeature__Group__31215);
            rule__RenameFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__4_in_rule__RenameFeature__Group__31218);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:634:1: rule__RenameFeature__Group__3__Impl : ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* ) ;
    public final void rule__RenameFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:639:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:639:1: ( ( rule__RenameFeature__AllRefactoringsAssignment_3 )* )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:640:1: ( rule__RenameFeature__AllRefactoringsAssignment_3 )*
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_3()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:641:1: ( rule__RenameFeature__AllRefactoringsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:641:2: rule__RenameFeature__AllRefactoringsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_3_in_rule__RenameFeature__Group__3__Impl1245);
            	    rule__RenameFeature__AllRefactoringsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:651:1: rule__RenameFeature__Group__4 : rule__RenameFeature__Group__4__Impl ;
    public final void rule__RenameFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:655:1: ( rule__RenameFeature__Group__4__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:656:2: rule__RenameFeature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameFeature__Group__4__Impl_in_rule__RenameFeature__Group__41276);
            rule__RenameFeature__Group__4__Impl();

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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:662:1: rule__RenameFeature__Group__4__Impl : ( '}' ) ;
    public final void rule__RenameFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:666:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:667:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:667:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:668:1: '}'
            {
             before(grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RenameFeature__Group__4__Impl1304); 
             after(grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__RenameClass__Group__0"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:691:1: rule__RenameClass__Group__0 : rule__RenameClass__Group__0__Impl rule__RenameClass__Group__1 ;
    public final void rule__RenameClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:695:1: ( rule__RenameClass__Group__0__Impl rule__RenameClass__Group__1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:696:2: rule__RenameClass__Group__0__Impl rule__RenameClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__0__Impl_in_rule__RenameClass__Group__01345);
            rule__RenameClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__1_in_rule__RenameClass__Group__01348);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:703:1: rule__RenameClass__Group__0__Impl : ( 'Refactoring_RenameClass' ) ;
    public final void rule__RenameClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:707:1: ( ( 'Refactoring_RenameClass' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:708:1: ( 'Refactoring_RenameClass' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:708:1: ( 'Refactoring_RenameClass' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:709:1: 'Refactoring_RenameClass'
            {
             before(grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__RenameClass__Group__0__Impl1376); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:722:1: rule__RenameClass__Group__1 : rule__RenameClass__Group__1__Impl rule__RenameClass__Group__2 ;
    public final void rule__RenameClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:726:1: ( rule__RenameClass__Group__1__Impl rule__RenameClass__Group__2 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:727:2: rule__RenameClass__Group__1__Impl rule__RenameClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__1__Impl_in_rule__RenameClass__Group__11407);
            rule__RenameClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__2_in_rule__RenameClass__Group__11410);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:734:1: rule__RenameClass__Group__1__Impl : ( ( rule__RenameClass__NameAssignment_1 ) ) ;
    public final void rule__RenameClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:738:1: ( ( ( rule__RenameClass__NameAssignment_1 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( ( rule__RenameClass__NameAssignment_1 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( ( rule__RenameClass__NameAssignment_1 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( rule__RenameClass__NameAssignment_1 )
            {
             before(grammarAccess.getRenameClassAccess().getNameAssignment_1()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( rule__RenameClass__NameAssignment_1 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:741:2: rule__RenameClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__NameAssignment_1_in_rule__RenameClass__Group__1__Impl1437);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:751:1: rule__RenameClass__Group__2 : rule__RenameClass__Group__2__Impl rule__RenameClass__Group__3 ;
    public final void rule__RenameClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:755:1: ( rule__RenameClass__Group__2__Impl rule__RenameClass__Group__3 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:756:2: rule__RenameClass__Group__2__Impl rule__RenameClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__2__Impl_in_rule__RenameClass__Group__21467);
            rule__RenameClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__3_in_rule__RenameClass__Group__21470);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:763:1: rule__RenameClass__Group__2__Impl : ( '{' ) ;
    public final void rule__RenameClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:767:1: ( ( '{' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:768:1: ( '{' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:768:1: ( '{' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:769:1: '{'
            {
             before(grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RenameClass__Group__2__Impl1498); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:782:1: rule__RenameClass__Group__3 : rule__RenameClass__Group__3__Impl rule__RenameClass__Group__4 ;
    public final void rule__RenameClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:786:1: ( rule__RenameClass__Group__3__Impl rule__RenameClass__Group__4 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:787:2: rule__RenameClass__Group__3__Impl rule__RenameClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__3__Impl_in_rule__RenameClass__Group__31529);
            rule__RenameClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__4_in_rule__RenameClass__Group__31532);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:794:1: rule__RenameClass__Group__3__Impl : ( 'classToBeRename' ) ;
    public final void rule__RenameClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:798:1: ( ( 'classToBeRename' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:799:1: ( 'classToBeRename' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:799:1: ( 'classToBeRename' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:800:1: 'classToBeRename'
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RenameClass__Group__3__Impl1560); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:813:1: rule__RenameClass__Group__4 : rule__RenameClass__Group__4__Impl rule__RenameClass__Group__5 ;
    public final void rule__RenameClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:817:1: ( rule__RenameClass__Group__4__Impl rule__RenameClass__Group__5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:818:2: rule__RenameClass__Group__4__Impl rule__RenameClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__4__Impl_in_rule__RenameClass__Group__41591);
            rule__RenameClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__5_in_rule__RenameClass__Group__41594);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:825:1: rule__RenameClass__Group__4__Impl : ( ':' ) ;
    public final void rule__RenameClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:829:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:830:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:830:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:831:1: ':'
            {
             before(grammarAccess.getRenameClassAccess().getColonKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RenameClass__Group__4__Impl1622); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:844:1: rule__RenameClass__Group__5 : rule__RenameClass__Group__5__Impl rule__RenameClass__Group__6 ;
    public final void rule__RenameClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:848:1: ( rule__RenameClass__Group__5__Impl rule__RenameClass__Group__6 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:849:2: rule__RenameClass__Group__5__Impl rule__RenameClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__5__Impl_in_rule__RenameClass__Group__51653);
            rule__RenameClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__6_in_rule__RenameClass__Group__51656);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:856:1: rule__RenameClass__Group__5__Impl : ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) ) ;
    public final void rule__RenameClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:860:1: ( ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:861:1: ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:861:1: ( ( rule__RenameClass__ClassToBeRenameAssignment_5 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:862:1: ( rule__RenameClass__ClassToBeRenameAssignment_5 )
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameAssignment_5()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:863:1: ( rule__RenameClass__ClassToBeRenameAssignment_5 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:863:2: rule__RenameClass__ClassToBeRenameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__ClassToBeRenameAssignment_5_in_rule__RenameClass__Group__5__Impl1683);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:873:1: rule__RenameClass__Group__6 : rule__RenameClass__Group__6__Impl rule__RenameClass__Group__7 ;
    public final void rule__RenameClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:877:1: ( rule__RenameClass__Group__6__Impl rule__RenameClass__Group__7 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:878:2: rule__RenameClass__Group__6__Impl rule__RenameClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__6__Impl_in_rule__RenameClass__Group__61713);
            rule__RenameClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__7_in_rule__RenameClass__Group__61716);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:885:1: rule__RenameClass__Group__6__Impl : ( 'newName' ) ;
    public final void rule__RenameClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:889:1: ( ( 'newName' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:890:1: ( 'newName' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:890:1: ( 'newName' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:891:1: 'newName'
            {
             before(grammarAccess.getRenameClassAccess().getNewNameKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__RenameClass__Group__6__Impl1744); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:904:1: rule__RenameClass__Group__7 : rule__RenameClass__Group__7__Impl rule__RenameClass__Group__8 ;
    public final void rule__RenameClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:908:1: ( rule__RenameClass__Group__7__Impl rule__RenameClass__Group__8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:909:2: rule__RenameClass__Group__7__Impl rule__RenameClass__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__7__Impl_in_rule__RenameClass__Group__71775);
            rule__RenameClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__8_in_rule__RenameClass__Group__71778);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:916:1: rule__RenameClass__Group__7__Impl : ( ':' ) ;
    public final void rule__RenameClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:920:1: ( ( ':' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( ':' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( ':' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:922:1: ':'
            {
             before(grammarAccess.getRenameClassAccess().getColonKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RenameClass__Group__7__Impl1806); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:935:1: rule__RenameClass__Group__8 : rule__RenameClass__Group__8__Impl rule__RenameClass__Group__9 ;
    public final void rule__RenameClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:939:1: ( rule__RenameClass__Group__8__Impl rule__RenameClass__Group__9 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:940:2: rule__RenameClass__Group__8__Impl rule__RenameClass__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__8__Impl_in_rule__RenameClass__Group__81837);
            rule__RenameClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__9_in_rule__RenameClass__Group__81840);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:947:1: rule__RenameClass__Group__8__Impl : ( ( rule__RenameClass__NewNameAssignment_8 ) ) ;
    public final void rule__RenameClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:951:1: ( ( ( rule__RenameClass__NewNameAssignment_8 ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:952:1: ( ( rule__RenameClass__NewNameAssignment_8 ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:952:1: ( ( rule__RenameClass__NewNameAssignment_8 ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:953:1: ( rule__RenameClass__NewNameAssignment_8 )
            {
             before(grammarAccess.getRenameClassAccess().getNewNameAssignment_8()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:954:1: ( rule__RenameClass__NewNameAssignment_8 )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:954:2: rule__RenameClass__NewNameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__NewNameAssignment_8_in_rule__RenameClass__Group__8__Impl1867);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:964:1: rule__RenameClass__Group__9 : rule__RenameClass__Group__9__Impl ;
    public final void rule__RenameClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:968:1: ( rule__RenameClass__Group__9__Impl )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:969:2: rule__RenameClass__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameClass__Group__9__Impl_in_rule__RenameClass__Group__91897);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:975:1: rule__RenameClass__Group__9__Impl : ( '}' ) ;
    public final void rule__RenameClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:979:1: ( ( '}' ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:980:1: ( '}' )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:980:1: ( '}' )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:981:1: '}'
            {
             before(grammarAccess.getRenameClassAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RenameClass__Group__9__Impl1925); 
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1015:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1019:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1020:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1020:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1021:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Model__NameAssignment_11981); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1030:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1034:1: ( ( ruleImport ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1035:1: ( ruleImport )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1035:1: ( ruleImport )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1036:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_22012);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1045:1: rule__Model__ContainsAssignment_3 : ( ruleType ) ;
    public final void rule__Model__ContainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1049:1: ( ( ruleType ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1050:1: ( ruleType )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1050:1: ( ruleType )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: ruleType
            {
             before(grammarAccess.getModelAccess().getContainsTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Model__ContainsAssignment_32043);
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1060:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1064:1: ( ( RULE_STRING ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1065:1: ( RULE_STRING )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1065:1: ( RULE_STRING )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1066:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_12074); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1075:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1079:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1081:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Class__NameAssignment_12105); 
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


    // $ANTLR start "rule__RenameFeature__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1090:1: rule__RenameFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1094:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1095:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1095:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1096:1: RULE_ID
            {
             before(grammarAccess.getRenameFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameFeature__NameAssignment_12136); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1105:1: rule__RenameFeature__AllRefactoringsAssignment_3 : ( ruleRenameClass ) ;
    public final void rule__RenameFeature__AllRefactoringsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1109:1: ( ( ruleRenameClass ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1110:1: ( ruleRenameClass )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1110:1: ( ruleRenameClass )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1111:1: ruleRenameClass
            {
             before(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_rule__RenameFeature__AllRefactoringsAssignment_32167);
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


    // $ANTLR start "rule__RenameClass__NameAssignment_1"
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1120:1: rule__RenameClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1125:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1125:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1126:1: RULE_ID
            {
             before(grammarAccess.getRenameClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameClass__NameAssignment_12198); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1135:1: rule__RenameClass__ClassToBeRenameAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RenameClass__ClassToBeRenameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1139:1: ( ( ( RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1140:1: ( ( RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1140:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1141:1: ( RULE_ID )
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0()); 
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1142:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1143:1: RULE_ID
            {
             before(grammarAccess.getRenameClassAccess().getClassToBeRenameClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameClass__ClassToBeRenameAssignment_52233); 
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
    // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: rule__RenameClass__NewNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__RenameClass__NewNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1158:1: ( ( RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1159:1: ( RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1159:1: ( RULE_ID )
            // ../com.br.refactoring.xtext.dsl.ui/src-gen/com/br/refactoring/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1160:1: RULE_ID
            {
             before(grammarAccess.getRenameClassAccess().getNewNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameClass__NewNameAssignment_82268); 
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
        public static final BitSet FOLLOW_ruleRefactoring_in_entryRuleRefactoring301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRefactoring308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_ruleRefactoring334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameFeature367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__0_in_ruleRenameFeature393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_entryRuleRenameClass420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameClass427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__0_in_ruleRenameClass453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_rule__Type__Alternatives489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_rule__Type__Alternatives506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0536 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1598 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2658 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl688 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ContainsAssignment_3_in_rule__Model__Group__3__Impl746 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0785 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__0908 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__0911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Class__Group__0__Impl939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__0__Impl_in_rule__RenameFeature__Group__01031 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__1_in_rule__RenameFeature__Group__01034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RenameFeature__Group__0__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__1__Impl_in_rule__RenameFeature__Group__11093 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__2_in_rule__RenameFeature__Group__11096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__NameAssignment_1_in_rule__RenameFeature__Group__1__Impl1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__2__Impl_in_rule__RenameFeature__Group__21153 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__3_in_rule__RenameFeature__Group__21156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RenameFeature__Group__2__Impl1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__3__Impl_in_rule__RenameFeature__Group__31215 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__4_in_rule__RenameFeature__Group__31218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameFeature__AllRefactoringsAssignment_3_in_rule__RenameFeature__Group__3__Impl1245 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__RenameFeature__Group__4__Impl_in_rule__RenameFeature__Group__41276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RenameFeature__Group__4__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__0__Impl_in_rule__RenameClass__Group__01345 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__1_in_rule__RenameClass__Group__01348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__RenameClass__Group__0__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__1__Impl_in_rule__RenameClass__Group__11407 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__2_in_rule__RenameClass__Group__11410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__NameAssignment_1_in_rule__RenameClass__Group__1__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__2__Impl_in_rule__RenameClass__Group__21467 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__3_in_rule__RenameClass__Group__21470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RenameClass__Group__2__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__3__Impl_in_rule__RenameClass__Group__31529 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__4_in_rule__RenameClass__Group__31532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RenameClass__Group__3__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__4__Impl_in_rule__RenameClass__Group__41591 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__5_in_rule__RenameClass__Group__41594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RenameClass__Group__4__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__5__Impl_in_rule__RenameClass__Group__51653 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__6_in_rule__RenameClass__Group__51656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__ClassToBeRenameAssignment_5_in_rule__RenameClass__Group__5__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__6__Impl_in_rule__RenameClass__Group__61713 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__7_in_rule__RenameClass__Group__61716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__RenameClass__Group__6__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__7__Impl_in_rule__RenameClass__Group__71775 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__8_in_rule__RenameClass__Group__71778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RenameClass__Group__7__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__8__Impl_in_rule__RenameClass__Group__81837 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__9_in_rule__RenameClass__Group__81840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__NewNameAssignment_8_in_rule__RenameClass__Group__8__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameClass__Group__9__Impl_in_rule__RenameClass__Group__91897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RenameClass__Group__9__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_11981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_22012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Model__ContainsAssignment_32043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_12074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_12105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameFeature__NameAssignment_12136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_rule__RenameFeature__AllRefactoringsAssignment_32167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameClass__NameAssignment_12198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameClass__ClassToBeRenameAssignment_52233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameClass__NewNameAssignment_82268 = new BitSet(new long[]{0x0000000000000002L});
    }


}