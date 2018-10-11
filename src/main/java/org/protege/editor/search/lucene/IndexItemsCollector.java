package org.protege.editor.search.lucene;

import org.apache.lucene.document.Document;
import org.semanticweb.owlapi.model.OWLObjectVisitor;

import java.util.Set;

public abstract class IndexItemsCollector implements OWLObjectVisitor {

    public abstract Set<Document> getIndexDocuments();
}
