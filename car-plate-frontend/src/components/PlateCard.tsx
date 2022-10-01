import Button from "@mui/material/Button";
import Card from "@mui/material/Card";
import CardActions from "@mui/material/CardActions";
import CardContent from "@mui/material/CardContent";
import {Plate,Comment} from "../pages/Home";


type PlateCardProps = {
    plate:Plate;
};

export default function PlateCard({plate}: PlateCardProps) {
    return (

        <div className="border-2 border-rose-600">
        <Card >
            <CardContent>{plate.plateNumber}
                <ul>

                    <li>{plate.id}</li>
                    {plate.commentList?.map((comment:Comment) => (
                        <li>{comment.text}</li>
                    ))}



                </ul>
            </CardContent>
            <CardActions>
                <Button size="small">Learn More</Button>


            </CardActions>
        </Card>
        </div>
    );
}
