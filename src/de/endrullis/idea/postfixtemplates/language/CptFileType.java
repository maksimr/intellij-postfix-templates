package de.endrullis.idea.postfixtemplates.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class CptFileType extends LanguageFileType {
	public static final CptFileType INSTANCE = new CptFileType();

	private CptFileType() {
		super(CptLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Postfix templates file type";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Postfix templates file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "postfixTemplates";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return CptIcons.FILE;
	}
}