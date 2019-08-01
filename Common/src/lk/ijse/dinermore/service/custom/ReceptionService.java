package lk.ijse.dinermore.service.custom;

import lk.ijse.dinermore.dto.ReceptionDTO;
import lk.ijse.dinermore.service.SuperService;

import java.util.List;

public interface ReceptionService extends SuperService {

    public boolean addReception(ReceptionDTO receptionDTO) throws Exception;

    public boolean deleteReception(String cid) throws Exception;

    public ReceptionDTO searchReception(String cid) throws Exception;

    public boolean updateReception(ReceptionDTO receptionDTO) throws Exception;

    public List<ReceptionDTO> getAllReception() throws Exception;

}
