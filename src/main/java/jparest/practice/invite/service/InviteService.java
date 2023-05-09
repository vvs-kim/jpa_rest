package jparest.practice.invite.service;

import jparest.practice.group.repository.GroupRepository;
import jparest.practice.invite.repository.InviteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InviteService {

    private final GroupRepository groupRepository;
    private final InviteRepository inviteRepository;


    /**
     * 그룹 초대
     */
    @Transactional
    public Long invite(Long memberId, Long groupId, Long recvUserId) {

        // 엔티티 조회
//        GroupMember groupMember = groupRepository.findByGroupIdAndMemberId(groupId, memberId);

        // 그룹 초대 생성
//        Invite invite = Invite.createInvite(recvUserId, groupMember);

        // 초대 저장
//        inviteRepository.save(invite);
//        return invite.getId();

        // TODO: 로직 수정후 변경하기
        return 1L;
    }

}
