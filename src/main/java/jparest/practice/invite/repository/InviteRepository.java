package jparest.practice.invite.repository;

import jparest.practice.invite.domain.Invite;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface InviteRepository extends JpaRepository<Invite, Long> {

//    private final EntityManager em;

//    public List<Invite> findByRecvUserId(Long id) {
//        return em.createQuery("select i from Invite i where i.id = :id",
//                        Invite.class)
//                .setParameter("id", id)
//                .getResultList();
//    }
}
