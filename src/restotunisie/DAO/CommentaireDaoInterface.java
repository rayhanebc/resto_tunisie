/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Commentaire;

/**
 *
 * @author lenovo
 */
public interface CommentaireDaoInterface {
    public void createCommentaire(Commentaire commentaire);
    public void updateCommentaire(Commentaire commentaire);
    public void deleteCommentaire(Commentaire commentaire);
    public Commentaire findCommentaire(String label);
    public List<Commentaire> findAllCommentaire();
    
}
