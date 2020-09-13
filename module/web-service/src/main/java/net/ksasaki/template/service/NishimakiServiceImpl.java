package net.ksasaki.template.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class NishimakiServiceImpl implements NishimakiService {

    private final NishimakiRepository nishimakiRepository;

    @Override
    public NishimakiModel getById(Long nishimakiId){
        return nishimakiRepository.findById(nishimakiId);
    }

}
